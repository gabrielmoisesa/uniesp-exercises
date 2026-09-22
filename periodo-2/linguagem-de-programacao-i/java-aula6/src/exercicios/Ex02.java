package exercicios;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      classificarSinal(scanner);
    }
  }

  public static void classificarSinal(Scanner scanner) {
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    if (numero > 0) {
      System.out.println(numero + " é um número positivo.");
    } else if (numero < 0) {
      System.out.println(numero + " é um número negativo.");
    } else {
      System.out.println(numero + " é igual a zero.");
    }
  }
}
