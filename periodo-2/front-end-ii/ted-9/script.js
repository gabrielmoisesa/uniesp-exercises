const form = document.querySelector('#form');
const input = document.querySelector('#input');
const lista = document.querySelector('#lista');
const contador = document.querySelector('#contador');

function atualizarContador() {
  const pendentes = lista.querySelectorAll('li:not(.feita)').length;
  contador.textContent = pendentes + ' pendente(s)';
}

function adicionarTarefa(texto) {
  const li = document.createElement('li');
  const span = document.createElement('span');
  const botao = document.createElement('button');

  span.textContent = texto;
  botao.textContent = 'Remover';

  li.append(span, botao);
  lista.append(li);
}

form.addEventListener('submit', (evento) => {
  evento.preventDefault(); // não recarregar a página
  adicionarTarefa(input.value);
  input.value = '';
  atualizarContador();
});

lista.addEventListener('click', (evento) => {
  const li = evento.target.closest('li');

  if (evento.target.tagName === 'BUTTON') {
    li.remove();
  } else {
    li.classList.toggle('feita');
  }
  atualizarContador();
});

atualizarContador();
