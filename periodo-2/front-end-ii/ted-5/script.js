const formulario = document.getElementById('formulario-soma');
const primeiroNumero = document.getElementById('primeiro-numero');
const segundoNumero = document.getElementById('segundo-numero');
const resultado = document.getElementById('resultado');
const mensagem = document.getElementById('mensagem');
const limpar = document.getElementById('limpar');

formulario.addEventListener('submit', (event) => {
  event.preventDefault();

  const primeiroValor = primeiroNumero.value.trim();
  const segundoValor = segundoNumero.value.trim();
  const primeiroNumeroConvertido = Number(primeiroValor);
  const segundoNumeroConvertido = Number(segundoValor);

  if (
    primeiroValor === '' ||
    segundoValor === '' ||
    !Number.isFinite(primeiroNumeroConvertido) ||
    !Number.isFinite(segundoNumeroConvertido)
  ) {
    resultado.value = '';
    mensagem.textContent = 'Preencha os dois campos com números válidos.';
    return;
  }

  resultado.value = primeiroNumeroConvertido + segundoNumeroConvertido;
  mensagem.textContent = '';
});

limpar.addEventListener('click', () => {
  formulario.reset();
  resultado.value = '';
  mensagem.textContent = '';
});
