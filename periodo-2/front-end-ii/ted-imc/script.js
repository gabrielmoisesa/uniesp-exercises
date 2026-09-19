let peso = Number(
  window.prompt('Digite seu peso (kg):').replace(/\./g, '').replace(',', '.'),
);
let altura = Number(
  window.prompt('Digite sua altura (m):').replace(/\./g, '').replace(',', '.'),
);
let imc = peso / (altura * altura);

let classificacao;

if (imc >= 40) {
  classificacao = 'Obesidade grau III';
} else if (imc >= 35) {
  classificacao = 'Obesidade grau II';
} else if (imc >= 30) {
  classificacao = 'Obesidade grau I';
} else if (imc >= 25) {
  classificacao = 'Sobrepeso';
} else if (imc >= 18.5) {
  classificacao = 'Peso normal';
} else {
  classificacao = 'Baixo peso';
}

document.getElementById('peso').textContent = `Peso: ${peso} kg`;
document.getElementById('altura').textContent = `Altura: ${altura} m`;
document.getElementById('imc').textContent = `IMC: ${imc.toFixed(2)}`;
document.getElementById('classificacao').textContent =
  `Classificação: ${classificacao}`;

alert(`Classificação de saúde: ${classificacao}`);
