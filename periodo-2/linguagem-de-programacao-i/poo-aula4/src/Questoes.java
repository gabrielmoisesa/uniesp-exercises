public class Questoes {
  // ============
  // Exercício 1
  // ============
  // Analise o código abaixo:
  public static void exercicio1() {
    int a = 10;

    if (a > 0) {
      int b = 20;
      System.out.println(a);
      System.out.println(b);
    }

    System.out.println(a);
  }

  // Responda:
  // a) Qual é o valor apresentado pelo primeiro System.out.println(a)?
  // R: 10.

  // b) Qual é o valor apresentado pelo System.out.println(b)?
  // R: 20.

  // c) O último System.out.println(a) pode ser executado?
  // R: Sim, pois faz parte do mesmo escopo.

  // d) Seria possível colocar System.out.println(b) depois do if? Justifique.
  // R: Não, pois "b" é uma variável local do if, sendo possível usá-la apenas
  // dentro do escopo da condicional.

  // e) Explique, com suas palavras, o que significa dizer que uma variável possui
  // um determinado escopo.
  // R: Significa que essa variável está delimitada a ser usada apenas em um certo
  // bloco de código em que ela está.

  // ============
  // Exercício 2
  // ============
  // Observe:
  // public static void exercicio2() {
  // if (10 > 5) {
  // int numero = 50;
  // }
  // System.out.println(numero);
  // }

  // Sua tarefa é:
  // 1. Identificar o problema.
  // R: Uso de variável fora do escopo.

  // 2. Explicar por que ele acontece.
  // R: Acontece pois a variável foi declarada dentro do bloco do if, sendo
  // possível ser usada apenas dentro daquele bloco e não fora.

  // 3. Corrigir o programa para que o valor 50 possa ser apresentado fora do
  // bloco if.

  public static void exercicio2() {
    int numero;

    if (10 > 5) {
      numero = 50;
    }

    System.out.println(numero);
  }

  // ============
  // Exercício 3
  // ============
  public static void exercicio3() {
    int numero;
    String nome;
    double preco;
    boolean rodando;

    numero = 5;
    nome = "Gabriel";
    preco = 5.99;
    rodando = true;

    System.out.println(numero);
    System.out.println(nome);
    System.out.println(preco);
    System.out.println(rodando);
  }

  // ============
  // Exercício 4
  // ============
  public static void exercicio4() {
    final String nome = "João";
    final String curso = "Programação Java";
    final String mensagem = "\"Bem-vindo ao curso!\"";

    System.out.println("Nome: " + nome + "\nCurso: " + curso + "\nMensagem: " + mensagem);

    System.out.println("\nNome:\tGabriel\nCurso:\t\\\"Ciência da Computação\"\\");
  }

  // ============
  // Exercício 5
  // ============
  public static void exercicio5() {
    String nome = "Gabriel";
    String curso = "Ciências da Computação";
    String instituicao = "UNIESP";

    System.out.println("Nome: " + nome + "\nCurso: " + curso + "\nInstituição: " + instituicao);
  }
}
