# POO — Aula 3: Sintaxe da Linguagem e Variáveis

Lista de exercícios práticos da disciplina de Programação Orientada a Objetos,
baseada nos conteúdos da Aula 3: sintaxe Java, criação de classes, método main,
entrada/saída de dados, Scanner, variáveis, tipos primitivos, identificadores,
constantes e datas.

**Aluno:** Gabriel Moises Alves

## Estrutura

Cada exercício está em um arquivo `.java` separado dentro de `src/`, com sua
própria classe e método `main`. Os exercícios 20 e o Desafio Final possuem
requisitos específicos de nomenclatura (pedidos no enunciado):

- `Ex20_SistemaAluno/Principal.java` — Exercício 20 pede um "projeto" chamado
  `SistemaAluno` com uma classe `Principal`.
- `DesafioFinal_CadastroPessoa.java` — Desafio Final pede um programa chamado
  `CadastroPessoa`.

## Como rodar

### VS Code

Abra qualquer arquivo `.java` no VS Code (com a extensão Java instalada) e use
o botão ▶ **Run** acima do método `main`.

Ou via terminal:

```bash
javac src/NomeDoArquivo.java -d out
java -cp out NomeDoArquivo
```

### Eclipse

1. **File → Open Projects from File System...** e selecione a pasta `poo-aula3`
   (ou **File → Import → General → Existing Projects into Workspace**, se
   preferir importar como projeto Eclipse).
2. No **Package Explorer**, expanda `src` e abra o arquivo `.java` desejado.
3. Clique com o botão direito no arquivo → **Run As → Java Application**.
4. O console aparece na aba **Console**, na parte inferior da tela.

## Conteúdo praticado

- Variáveis e tipos primitivos (`byte`, `short`, `int`, `long`, `float`,
  `double`, `boolean`, `char`) e `String`
- Entrada de dados com `Scanner` (`nextLine()`, `nextInt()`, `nextDouble()`)
- Tratamento de buffer do `Scanner`
- Identificadores válidos
- Constantes com `final`
- Datas com `LocalDate` e formatação com `DateTimeFormatter`