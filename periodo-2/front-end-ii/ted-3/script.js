let base = Number(
  window.prompt('Digite a base:').replace(/\./g, '').replace(',', '.'),
);
let altura = Number(
  window.prompt('Digite a altura:').replace(/\./g, '').replace(',', '.'),
);

let areaTriângulo = (base * altura) / 2;

document.getElementById('base').textContent = `Base: ${base}`;
document.getElementById('altura').textContent = `Altura: ${altura}`;
document.getElementById('area').textContent = `Área: ${areaTriângulo}`;
