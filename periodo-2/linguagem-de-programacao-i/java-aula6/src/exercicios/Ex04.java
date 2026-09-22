package exercicios;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      descontoNaCompra(scanner);
    }
  }

  public static void descontoNaCompra(Scanner scanner) {
    System.out.print("Digite o valor da compra: ");
    double valorCompra = scanner.nextDouble();
    double valorDesconto = 0;
    double valorFinal = valorCompra;

    if (valorCompra >= 100) {
      valorDesconto = valorCompra * 0.10;
      valorFinal = valorCompra - valorDesconto;
    }

    System.out.println("\n=== Compra ===");
    System.out.printf("Valor da compra: %.2f $%n", valorCompra);
    System.out.printf("Valor do desconto: %.2f $%n", valorDesconto);
    System.out.printf("Valor final da compra: %.2f $%n", valorFinal);
  }
}
