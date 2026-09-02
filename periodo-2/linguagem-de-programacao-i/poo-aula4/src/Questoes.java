import java.util.ArrayList;

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

  // ============
  // Exercício 6
  // ============
  public static void exercicio6() {
    int inteiro = 650;
    long inteiroLongo = inteiro;

    float altura = 1.79f;
    double alturaDouble = altura;

    char caractere = '5';
    int caractereInteiro = caractere;

    System.out.println("Inteiro: " + inteiro);
    System.out.println("Inteiro em long: " + inteiroLongo);
    System.out.println("\nFloat: " + altura);
    System.out.println("Float em double: " + alturaDouble);
    System.out.println("\nChar: " + caractere);
    System.out.println("Char como int: " + caractereInteiro);

    System.out.println("Soma de int + char + long + double: " + (inteiro + caractere + inteiroLongo + alturaDouble));
  }

  // ============
  // Exercício 7
  // ============
  public static void exercicio7() {
    long valorLong = 2;
    float valorFloat = 2.75f;
    double valorDouble = 6.5;

    int longEmInt = (int) valorLong;
    int floatEmInt = (int) valorFloat;
    int doubleEmInt = (int) valorDouble;
    float doubleEmFloat = (float) valorDouble;

    System.out.println("O valor long: " + valorLong + " em int é = " + longEmInt);
    System.out.println("O valor float: " + valorFloat + " em int é = " + floatEmInt);
    System.out.println("O valor double: " + valorDouble + " em int é = " + doubleEmInt);
    System.out.println("O valor double: " + valorDouble + " em float é = " + doubleEmFloat);
  }

  // ============
  // Exercício 8
  // ============
  public static void exercicio8() {
    int j = (int) (long) 1.5;
    double d = (int) 1.5;
    double d2 = (float) 1.5;

    System.out.println(j);
    System.out.println(d);
    System.out.println(d2);
  }

  // ============
  // Exercício 9
  // ============
  public static void exercicio9() {
    float f = 32.5f;
    double d = 32.5;

    System.out.println(f);
    System.out.println(d);
  }

  // ============
  // Exercício 10
  // ============
  public static void exercicio10() {
    int x = 200;
    byte b = (byte) x;

    System.out.println(b); // = -56
  }

  // ============
  // Exercício 11
  // ============
  public static void exercicio11() {
    int n1 = Math.abs(-3);
    double n2 = Math.pow(2, 3);
    double n3 = Math.sqrt(16);
    long n4 = Math.round(2.75);

    System.out.println("Math.abs(-3) = " + n1);
    System.out.println("Math.pow(2, 3) = " + n2);
    System.out.println("Math.sqrt(16) = " + n3);
    System.out.println("Math.round(2.75) = " + n4);
  }

  // ============
  // Exercício 12
  // ============
  public static void exercicio12() {
    double graus = 180;
    double radianos = Math.toRadians(graus);
    double grausDeVolta = Math.toDegrees(radianos);

    System.out.println("PI: " + Math.PI);
    System.out.println(graus + " graus em radianos: " + radianos);
    System.out.println(radianos + " radianos em graus: " + grausDeVolta);
  }

  // ============
  // Exercício 13
  // ============
  public static void exercicio13() {
    int n1 = 0 + (int) (Math.random() * ((99 - 0) + 1));
    int n2 = 0 + (int) (Math.random() * ((99 - 0) + 1));
    int n3 = 0 + (int) (Math.random() * ((99 - 0) + 1));

    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
  }

  // ============
  // Exercício 14
  // ============
  public static void exercicio14() {
    ArrayList<Integer> numerosSorteados = new ArrayList<>();

    for (int i = 0; i < 6; i++) {
      int numeroAleatorio = 1 + (int) (Math.random() * ((60 - 1) + 1));

      if (numerosSorteados.contains(numeroAleatorio)) {
        i--;
        continue;
      }

      numerosSorteados.add(numeroAleatorio);
    }

    numerosSorteados.forEach(System.out::println);
  }
}
