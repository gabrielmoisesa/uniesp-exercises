const cv = document.getElementById('game');
const ctx = cv.getContext('2d');
const W = cv.width, H = cv.height;
const FONT = '"Press Start 2P", monospace';

const COLS = 10, ROWS = 7, BW = 44, BH = 20, GAP = 4;
const OFFX = (W - (COLS * (BW + GAP) - GAP)) / 2, OFFY = 70;
const ROW_COLORS = [
  ['#ff4f5e', '#a8132a'], ['#ff9a3d', '#b05410'], ['#ffd23f', '#a88a00'],
  ['#5be37d', '#1b8a3a'], ['#3de0ff', '#0d7fa0'], ['#7d7bff', '#3a2fb0'], ['#ff4fa3', '#a01a68']
];

let state, paddle, balls, bricks, powerups, particles, score, lives, level, keys = {}, mouseX = null, stars = [];

for (let i = 0; i < 60; i++) stars.push({ x: Math.random() * W, y: Math.random() * H, s: Math.random() * 1.5 + 0.5 });

function buildBricks() {
  bricks = [];
  for (let r = 0; r < ROWS; r++) for (let c = 0; c < COLS; c++) {
    if (level % 2 === 0 && (r + c) % 4 === 0) continue;
    bricks.push({ x: OFFX + c * (BW + GAP), y: OFFY + r * (BH + GAP), r, hp: r < 2 && level > 1 ? 2 : 1 });
  }
}
function resetBall() {
  balls = [{ x: paddle.x + paddle.w / 2, y: paddle.y - 8, vx: 0, vy: 0, r: 7, stuck: true }];
}
function newGame() {
  paddle = { w: 80, h: 14, x: W / 2 - 40, y: H - 40 };
  score = 0; lives = 3; level = 1; powerups = []; particles = [];
  buildBricks(); resetBall(); state = 'ready';
}
function launch() {
  balls.forEach(b => { if (b.stuck) { b.stuck = false; const sp = 4.6 + level * 0.3; b.vx = sp * 0.5; b.vy = -sp; } });
  state = 'play';
}
function burst(x, y, color) {
  for (let i = 0; i < 10; i++) particles.push({ x, y, vx: (Math.random() - .5) * 5, vy: (Math.random() - .5) * 5, life: 24, color });
}

// --- áudio retrô (onda quadrada) ---
let ac;
function beep(f, d = .07, t = 'square') {
  try {
    ac = ac || new (window.AudioContext || window.webkitAudioContext)();
    const o = ac.createOscillator(), g = ac.createGain();
    o.type = t; o.frequency.value = f; g.gain.value = .05;
    g.gain.exponentialRampToValueAtTime(.001, ac.currentTime + d);
    o.connect(g); g.connect(ac.destination); o.start(); o.stop(ac.currentTime + d);
  } catch (e) {}
}

function update() {
  if (state === 'pause' || state === 'over' || state === 'win') return;
  const sp = 7;
  if (keys.ArrowLeft) { paddle.x -= sp; mouseX = null; }
  if (keys.ArrowRight) { paddle.x += sp; mouseX = null; }
  if (mouseX !== null) paddle.x = mouseX - paddle.w / 2;
  paddle.x = Math.max(6, Math.min(W - paddle.w - 6, paddle.x));

  for (const b of balls) {
    if (b.stuck) { b.x = paddle.x + paddle.w / 2; b.y = paddle.y - b.r - 1; continue; }
    b.x += b.vx; b.y += b.vy;
    if (b.x < b.r + 6) { b.x = b.r + 6; b.vx *= -1; beep(220); }
    if (b.x > W - b.r - 6) { b.x = W - b.r - 6; b.vx *= -1; beep(220); }
    if (b.y < b.r + 6) { b.y = b.r + 6; b.vy *= -1; beep(220); }
    if (b.vy > 0 && b.y + b.r >= paddle.y && b.y - b.r <= paddle.y + paddle.h && b.x >= paddle.x - 4 && b.x <= paddle.x + paddle.w + 4) {
      const hit = (b.x - (paddle.x + paddle.w / 2)) / (paddle.w / 2);
      const speed = Math.min(9, Math.hypot(b.vx, b.vy) + 0.1);
      const ang = hit * 1.1;
      b.vx = speed * Math.sin(ang); b.vy = -speed * Math.cos(ang);
      b.y = paddle.y - b.r; beep(440);
    }
    for (const br of bricks) {
      if (br.dead) continue;
      if (b.x + b.r > br.x && b.x - b.r < br.x + BW && b.y + b.r > br.y && b.y - b.r < br.y + BH) {
        const ox = Math.min(b.x + b.r - br.x, br.x + BW - (b.x - b.r));
        const oy = Math.min(b.y + b.r - br.y, br.y + BH - (b.y - b.r));
        if (ox < oy) b.vx *= -1; else b.vy *= -1;
        br.hp--; beep(520 + br.r * 60, .06);
        if (br.hp <= 0) {
          br.dead = true; score += 10 * (ROWS - br.r); burst(br.x + BW / 2, br.y + BH / 2, ROW_COLORS[br.r][0]);
          if (Math.random() < .12) powerups.push({ x: br.x + BW / 2, y: br.y, type: Math.random() < .5 ? 'W' : 'M' });
        }
        break;
      }
    }
  }
  balls = balls.filter(b => b.y - b.r < H);
  if (!balls.length) {
    lives--; beep(110, .3, 'sawtooth');
    if (lives <= 0) state = 'over'; else { paddle.w = 80; resetBall(); state = 'ready'; }
  }
  for (const p of powerups) {
    p.y += 2.2;
    if (p.y > paddle.y && p.y < paddle.y + paddle.h + 10 && p.x > paddle.x && p.x < paddle.x + paddle.w) {
      p.got = true; beep(880, .15);
      if (p.type === 'W') paddle.w = Math.min(140, paddle.w + 30);
      else { const b = balls.find(b => !b.stuck) || balls[0]; for (const a of [-.5, .5]) balls.push({ x: b.x, y: b.y, vx: b.vx + a * 2, vy: b.vy || -4, r: 7, stuck: false }); }
    }
  }
  powerups = powerups.filter(p => !p.got && p.y < H);
  particles.forEach(p => { p.x += p.vx; p.y += p.vy; p.life--; });
  particles = particles.filter(p => p.life > 0);
  bricks = bricks.filter(b => !b.dead);
  if (!bricks.length && state === 'play') {
    level++; score += 200; powerups = []; paddle.w = 80; buildBricks(); resetBall(); state = 'ready'; beep(990, .3);
    if (level > 5) state = 'win';
  }
}

function text(t, x, y, size, color, align = 'center') {
  ctx.font = `${size}px ${FONT}`; ctx.textAlign = align;
  ctx.fillStyle = '#000'; ctx.fillText(t, x + 2, y + 2);
  ctx.fillStyle = color; ctx.fillText(t, x, y);
}
function bevel(x, y, w, h, [c1, c2]) {
  ctx.fillStyle = c2; ctx.fillRect(x, y, w, h);
  ctx.fillStyle = c1; ctx.fillRect(x, y, w - 3, h - 3);
  ctx.fillStyle = 'rgba(255,255,255,.55)'; ctx.fillRect(x, y, w - 3, 3); ctx.fillRect(x, y, 3, h - 3);
}

function draw(t) {
  const g = ctx.createLinearGradient(0, 0, 0, H);
  g.addColorStop(0, '#1b1464'); g.addColorStop(1, '#07051f');
  ctx.fillStyle = g; ctx.fillRect(0, 0, W, H);
  ctx.fillStyle = '#fff';
  stars.forEach(s => { ctx.globalAlpha = .4 + .4 * Math.sin(t / 400 + s.x); ctx.fillRect(s.x | 0, ((s.y + t * .01 * s.s) % H) | 0, s.s, s.s); });
  ctx.globalAlpha = 1;
  ctx.fillStyle = '#3de0ff'; ctx.fillRect(0, 0, W, 6); ctx.fillRect(0, 0, 6, H); ctx.fillRect(W - 6, 0, 6, H);

  bricks.forEach(b => { bevel(b.x, b.y, BW, BH, ROW_COLORS[b.r]); if (b.hp > 1) { ctx.fillStyle = 'rgba(0,0,0,.35)'; ctx.fillRect(b.x + BW / 2 - 6, b.y + 7, 12, 4); } });
  bevel(paddle.x, paddle.y, paddle.w, paddle.h, ['#ffd23f', '#b3651a']);
  ctx.fillStyle = '#ff4fa3'; ctx.fillRect(paddle.x + 4, paddle.y + paddle.h - 6, paddle.w - 11, 3);

  balls.forEach(b => {
    ctx.fillStyle = '#3de0ff'; ctx.beginPath(); ctx.arc(b.x, b.y, b.r, 0, 7); ctx.fill();
    ctx.fillStyle = '#fff'; ctx.fillRect(b.x - 4, b.y - 4, 3, 3);
  });
  powerups.forEach(p => { bevel(p.x - 10, p.y - 8, 20, 16, p.type === 'W' ? ['#5be37d', '#1b8a3a'] : ['#ff4fa3', '#a01a68']); text(p.type, p.x - 1, p.y + 5, 9, '#fff'); });
  particles.forEach(p => { ctx.fillStyle = p.color; ctx.fillRect(p.x, p.y, 4, 4); });

  text('SCORE ' + String(score).padStart(5, '0'), 18, 40, 10, '#ffd23f', 'left');
  text('LV ' + level, W / 2, 40, 10, '#3de0ff');
  text('♥'.repeat(lives), W - 18, 40, 12, '#ff4f5e', 'right');

  if (state === 'ready') text('PRESS SPACE', W / 2, H / 2 + 80, 14, (t / 400 | 0) % 2 ? '#fff' : '#ffd23f');
  if (state === 'pause') text('PAUSA', W / 2, H / 2, 24, '#fff');
  if (state === 'over') { text('GAME OVER', W / 2, H / 2 - 10, 26, '#ff4f5e'); text('ESPAÇO = reiniciar', W / 2, H / 2 + 30, 10, '#fff'); }
  if (state === 'win') { text('VOCÊ VENCEU!', W / 2, H / 2 - 10, 22, '#5be37d'); text('ESPAÇO = jogar de novo', W / 2, H / 2 + 30, 10, '#fff'); }
}

function loop(t) { update(); draw(t); requestAnimationFrame(loop); }

addEventListener('keydown', e => {
  keys[e.key] = true;
  if (e.code === 'Space') {
    e.preventDefault();
    if (state === 'ready') launch(); else if (state === 'over' || state === 'win') newGame();
  }
  if (e.key.toLowerCase() === 'p' && (state === 'play' || state === 'pause')) state = state === 'play' ? 'pause' : 'play';
});
addEventListener('keyup', e => keys[e.key] = false);
function pointer(e) {
  const r = cv.getBoundingClientRect(), cx = (e.touches ? e.touches[0].clientX : e.clientX);
  mouseX = (cx - r.left) * (W / r.width);
}
cv.addEventListener('mousemove', pointer);
cv.addEventListener('touchmove', e => { pointer(e); e.preventDefault(); }, { passive: false });
cv.addEventListener('click', () => { if (state === 'ready') launch(); else if (state === 'over' || state === 'win') newGame(); });
cv.addEventListener('touchstart', e => { pointer(e); if (state === 'ready') launch(); else if (state === 'over' || state === 'win') newGame(); }, { passive: true });

newGame(); requestAnimationFrame(loop);
