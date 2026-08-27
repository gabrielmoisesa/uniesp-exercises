import java.util.Scanner;

public class Ex19_ConstanteDePreco {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      final double PRECO_PRODUTO = 50.00;

      System.out.println("Digite quantos produtos deseja comprar:");
      int quantidade = input.nextInt();

      System.out.println("Valor total: R$" + (PRECO_PRODUTO * quantidade));
    }
  }
}
