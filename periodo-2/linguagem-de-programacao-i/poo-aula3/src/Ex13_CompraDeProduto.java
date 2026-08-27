import java.util.Scanner;

public class Ex13_CompraDeProduto {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Digite o nome do produto:");
      String nome = input.nextLine();

      System.out.println("Digite o preço do produto:");
      double preco = input.nextDouble();

      System.out.println("Digite a quantidade do produto:");
      int quantidade = input.nextInt();

      System.out.println("================");
      System.out.println("Resumo da Compra");
      System.out.println("================");
      System.out.println("Produto: " + nome);
      System.out.println("Preço: R$ " + preco);
      System.out.println("Quantidade: " + quantidade);
      System.out.println("Total: R$ " + preco * quantidade);
    }
  }
}
