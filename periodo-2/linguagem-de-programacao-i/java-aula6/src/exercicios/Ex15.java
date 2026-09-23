package exercicios;

import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      sistemaDeCompra(scanner);
    }
  }

  public static void sistemaDeCompra(Scanner scanner) {
    System.out.println("=== Sistema de Compra ===");

    System.out.print("Informe o nome do cliente: ");
    String nomeCliente = scanner.nextLine();

    System.out.print("Informe o valor da compra: ");
    double valorCompra = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("\n1 - Dinheiro\n2 - Pix\n3 - Cartão");
    System.out.print("Selecione a forma de pagamento: ");
    int opcaoPagamento = scanner.nextInt();
    scanner.nextLine();

    String formaPagamento;
    double desconto = valorCompra > 500 ? 0.05 : 0;

    switch (opcaoPagamento) {
      case 1:
        formaPagamento = "Dinheiro";
        desconto += 0.10;
        break;
      case 2:
        formaPagamento = "Pix";
        desconto += 0.05;
        break;
      case 3:
        formaPagamento = "Cartão";
        break;
      default:
        System.out.println("Forma de pagamento inválida.");
        return;
    }

    double valorFinal = valorCompra - (valorCompra * desconto);

    System.out.println("\n= Finalizar =");
    System.out.println("Cliente: " + nomeCliente);
    System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
    System.out.printf("Valor desconto: %.2f%%%n", Math.abs(desconto * 100));
    System.out.printf("Valor final: R$ %.2f%n", valorFinal);
    System.out.println("Forma de pagamento: " + formaPagamento);
  }
}
