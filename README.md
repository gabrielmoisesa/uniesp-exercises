# Exercícios de Computação — UNIESP

Repositório com exercícios, atividades e pequenos projetos desenvolvidos ao
longo do curso de **Ciência da Computação na UNIESP**. O conteúdo acompanha a
evolução das disciplinas e reúne exemplos de programação em Python, Java e
tecnologias web.

> O repositório tem finalidade principalmente acadêmica: os arquivos registram
> práticas, soluções de exercícios e experimentos realizados durante as aulas.

## Conteúdo

Os materiais estão separados por período:

```text
.
├── periodo-1/
│   └── introducao-a-programacao/
└── periodo-2/
    ├── estrutura-de-dados/
    ├── front-end-ii/
    └── linguagem-de-programacao-i/
```

### Primeiro período

Os exercícios de **Introdução à Programação** praticam os fundamentos de
Python:

- entrada e saída de dados;
- condicionais;
- laços `while` e `for`;
- listas;
- matrizes;
- funções;
- exercícios extras de revisão.

### Segundo período

O segundo período reúne atividades de:

- **Estrutura de Dados**, com listas de exercícios em Python;
- **Front-end II**, com páginas HTML, estilos CSS e scripts JavaScript,
  incluindo atividades de cálculo de IMC;
- **Linguagem de Programação I**, com exercícios em Java, sintaxe,
  variáveis, métodos, construtores, visibilidade, composição, agregação e
  fundamentos de orientação a objetos.

As pastas de POO também possuem READMEs específicos com detalhes de algumas
aulas:

- [`poo-aula3`](periodo-2/linguagem-de-programacao-i/poo-aula3/README.md)
- [`poo-aula4`](periodo-2/linguagem-de-programacao-i/poo-aula4/README.md)

## Tecnologias

| Tecnologia | Uso no repositório |
| --- | --- |
| [Python](https://www.python.org/) | Exercícios de lógica e estrutura de dados |
| [Java](https://www.oracle.com/java/) | Sintaxe, métodos e programação orientada a objetos |
| HTML | Estrutura das páginas web |
| CSS | Estilização das páginas web |
| JavaScript | Interatividade e cálculos no navegador |

## Pré-requisitos

Instale as ferramentas correspondentes à atividade que deseja executar:

- Python 3;
- JDK (Java Development Kit) para os exercícios Java;
- um navegador moderno para as atividades web;
- opcionalmente, [Visual Studio Code](https://code.visualstudio.com/) com as
  extensões de Python e Java.

Não há um projeto único nem um gerenciador de dependências global. Cada
exercício é independente e normalmente utiliza apenas a biblioteca padrão da
linguagem.

## Como executar

### Python

Entre na pasta do exercício e execute o arquivo desejado:

```bash
cd periodo-1/introducao-a-programacao/01-lista-de-python
python3 atv_01.py
```

O nome do arquivo pode variar conforme a atividade. Os programas interativos
solicitam os dados diretamente pelo terminal.

### Java

Entre na pasta do projeto, compile os arquivos e execute a classe que contém o
`main`. Por exemplo:

```bash
cd periodo-2/linguagem-de-programacao-i/poo-aula3
mkdir -p out
javac -d out $(find src -name '*.java')
java -cp out Ex01_Apresentacao
```

Para projetos com pacotes, use o nome completo da classe ao executar, como
`ex01_pessoa.Main`. As instruções específicas de cada aula podem variar; veja
o README da pasta quando ele existir.

### Front-end

Abra o arquivo `index.html` da atividade no navegador. Por exemplo:

```text
periodo-2/front-end-ii/ted-imc/index.html
```

As páginas carregam seus arquivos JavaScript e CSS relativos à própria pasta.
Para uma experiência mais próxima de um ambiente de desenvolvimento, também é
possível abrir a pasta no VS Code e utilizar uma extensão de servidor local.

## Organização dos exercícios

- `atv_01.py`, `atv_02.py` etc. representam atividades numeradas;
- projetos Java mantêm seus arquivos-fonte dentro de `src/`;
- atividades web agrupam `index.html`, `script.js` e, quando necessário,
  `style.css`;
- os exercícios são independentes, portanto não existe uma ordem de execução
  obrigatória fora da sequência sugerida pelos nomes das pastas.

## Observações

- Os exemplos podem refletir o enunciado e as ferramentas disponíveis no
  momento da aula.
- A saída esperada e os dados de entrada dependem de cada exercício.
- Arquivos compilados, configurações de IDE e saídas de build são ignorados
  pelo Git conforme o [`.gitignore`](.gitignore).

## Licença

Este repositório não possui uma licença formal definida. O conteúdo é
compartilhado como material de estudo.
