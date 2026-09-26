let base = Number(
  window.prompt('Digite a base (m²):').replace(/\./g, '').replace(',', '.'),
);
let altura = Number(
  window.prompt('Digite a altura (m²):').replace(/\./g, '').replace(',', '.'),
);

let areaTriângulo = (base * altura) / 2;

document.getElementById('base').textContent = `Base: ${base} m²`;
document.getElementById('altura').textContent = `Altura: ${altura} m²`;
document.getElementById('area').textContent = `Área: ${areaTriângulo} m²`;
