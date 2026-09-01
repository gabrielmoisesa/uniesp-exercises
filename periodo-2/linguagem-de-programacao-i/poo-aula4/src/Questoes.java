public class Questoes {
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
}
