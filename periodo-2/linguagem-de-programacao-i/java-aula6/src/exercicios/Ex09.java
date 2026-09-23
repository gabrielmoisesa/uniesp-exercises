package exercicios;

import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      menuDeLanchonete(scanner);
    }
  }

  public static void menuDeLanchonete(Scanner scanner) {
    System.out.println("""
        1 - Hambúrguer - R$ 15,00
        2 - Pizza - R$ 30,00
        3 - Sanduíche - R$ 12,00
        4 - Refrigerante - R$ 6,00
        """);

    System.out.print("Escolha um produto: ");
    int opcao = scanner.nextInt();

    String nomeProduto;
    double precoProduto;

    switch (opcao) {
      case 1:
        nomeProduto = "Hambúrguer";
        precoProduto = 15;
        break;
      case 2:
        nomeProduto = "Pizza";
        precoProduto = 30;
        break;
      case 3:
        nomeProduto = "Sanduíche";
        precoProduto = 12;
        break;
      case 4:
        nomeProduto = "Refrigerante";
        precoProduto = 6;
        break;
      default:
        System.out.println("Opção inválida! Produto não encontrado.");
        return;
    }

    System.out.print("Informe a quantidade desejada: ");
    int quantidade = scanner.nextInt();
    scanner.nextLine();

    if (quantidade <= 0) {
      System.out.println("Quantidade inválida. Escolha no mínimo 1 unidade.");
      return;
    }

    double valorTotal = precoProduto * quantidade;

    System.out.println("\n=== Finalizar Compra ===");
    System.out.println("Item: " + nomeProduto + "\nQuantidade: " + quantidade);
    System.out.printf("Valor total da compra: %.2f%n", valorTotal);
  }
}
