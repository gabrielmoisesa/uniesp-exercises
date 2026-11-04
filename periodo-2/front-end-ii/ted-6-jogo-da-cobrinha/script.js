'use strict';

const TAMANHO_CELULA = 20;
const QUANTIDADE_CELULAS = 20;
const INTERVALO_MOVIMENTO = 120;
const canvas = document.getElementById('canvas');
const contexto = canvas.getContext('2d');
const mensagemFim = document.getElementById('mensagem-fim');
const pontuacaoFinal = document.getElementById('pontuacao-final');
const elementoPontuacao = document.getElementById('pontuacao');
const botaoReiniciar = document.getElementById('botao-reiniciar');

let cobrinha;
let comida;
let direcao;
let proximaDirecao;
let intervaloJogo;
let pontos;

// Inicia a cobrinha no centro e começa o movimento automático.
function iniciarJogo() {
  cobrinha = [{ x: 10, y: 10 }];
  comida = gerarComida();
  direcao = { x: 1, y: 0 };
  proximaDirecao = { x: 1, y: 0 };
  pontos = 0;
  elementoPontuacao.textContent = pontos;
  mensagemFim.classList.remove('visivel');
  desenhar();
  clearInterval(intervaloJogo);
  intervaloJogo = setInterval(atualizar, INTERVALO_MOVIMENTO);
}

// Move a cabeça e reaproveita a posição ao atravessar uma borda.
function atualizar() {
  const novaCabeca = {
    x: (cobrinha[0].x + direcao.x + QUANTIDADE_CELULAS) % QUANTIDADE_CELULAS,
    y: (cobrinha[0].y + direcao.y + QUANTIDADE_CELULAS) % QUANTIDADE_CELULAS
  };

  const colidiuComCorpo = cobrinha.some(
    (parte) => parte.x === novaCabeca.x && parte.y === novaCabeca.y
  );

  if (colidiuComCorpo) {
    fimDeJogo();
    return;
  }

  direcao = proximaDirecao;
  cobrinha.unshift(novaCabeca);

  if (comida && novaCabeca.x === comida.x && novaCabeca.y === comida.y) {
    pontos += 10;
    elementoPontuacao.textContent = pontos;
    comida = gerarComida();
  } else {
    cobrinha.pop();
  }

  desenhar();
}

// Para o loop e exibe o resultado quando a cobrinha colide consigo mesma.
function fimDeJogo() {
  clearInterval(intervaloJogo);
  pontuacaoFinal.textContent = pontos;
  mensagemFim.classList.add('visivel');
}

// Escolhe uma célula livre para a próxima comida.
function gerarComida() {
  const celulasLivres = [];

  for (let x = 0; x < QUANTIDADE_CELULAS; x += 1) {
    for (let y = 0; y < QUANTIDADE_CELULAS; y += 1) {
      const ocupada = cobrinha.some((parte) => parte.x === x && parte.y === y);

      if (!ocupada) {
        celulasLivres.push({ x, y });
      }
    }
  }

  if (celulasLivres.length === 0) {
    return null;
  }

  return celulasLivres[Math.floor(Math.random() * celulasLivres.length)];
}

// Desenha o fundo, a comida vermelha e cada quadrado azul.
function desenhar() {
  contexto.fillStyle = '#111827';
  contexto.fillRect(0, 0, canvas.width, canvas.height);

  if (comida) {
    contexto.fillStyle = '#ef4444';
    contexto.fillRect(
      comida.x * TAMANHO_CELULA,
      comida.y * TAMANHO_CELULA,
      TAMANHO_CELULA - 1,
      TAMANHO_CELULA - 1
    );
  }

  contexto.fillStyle = '#3b82f6';

  cobrinha.forEach((parte) => {
    contexto.fillRect(
      parte.x * TAMANHO_CELULA,
      parte.y * TAMANHO_CELULA,
      TAMANHO_CELULA - 1,
      TAMANHO_CELULA - 1
    );
  });
}

// Impede inversão de 180 graus e evita que as setas rolem a página.
function alterarDirecao(evento) {
  const direcoes = {
    ArrowUp: { x: 0, y: -1 },
    ArrowDown: { x: 0, y: 1 },
    ArrowLeft: { x: -1, y: 0 },
    ArrowRight: { x: 1, y: 0 }
  };
  const novaDirecao = direcoes[evento.key];

  if (!novaDirecao) {
    return;
  }

  evento.preventDefault();
  const ehInversao = novaDirecao.x === -direcao.x && novaDirecao.y === -direcao.y;

  if (!ehInversao) {
    proximaDirecao = novaDirecao;
  }
}

document.addEventListener('keydown', alterarDirecao);
botaoReiniciar.addEventListener('click', iniciarJogo);
document.addEventListener('keydown', (evento) => {
  const podeReiniciar = evento.key === 'Enter' || evento.key === ' ';

  if (podeReiniciar && mensagemFim.classList.contains('visivel')) {
    evento.preventDefault();
    iniciarJogo();
  }
});
iniciarJogo();
