package exercicios;

import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      sistemaDePagamento(scanner);
    }
  }

  public static void sistemaDePagamento(Scanner scanner) {
    System.out.println("=== Sistema de Pagamento ===");

    System.out.print("Informe o valor da compra: ");
    double valorCompra = scanner.nextDouble();

    System.out.println("""
        1 - Dinheiro
        2 - Pix
        3 - Cartão de crédito
        4 - Cartão de débito
        """);
    System.out.print("Escolha a forma de pagamento: ");
    int opcaoPagamento = scanner.nextInt();
    scanner.nextLine();

    double desconto;

    switch (opcaoPagamento) {
      case 1:
        desconto = -0.10;
        break;
      case 2:
        desconto = -0.05;
        break;
      case 3:
        desconto = 0;
        break;
      case 4:
        desconto = -0.02;
        break;
      default:
        System.out.println("Opção da pagamento inválida.");
        return;
    }

    double valorFinal = valorCompra + (valorCompra * desconto);

    System.out.println("\n=== Finalizar ===");
    System.out.printf("Valor original: R$ %.2f%n", valorCompra);
    System.out.println("Desconto: " + desconto * 100 + "%");
    System.out.printf("Valor final: R$ %.2f%n", valorFinal);
  }
}
