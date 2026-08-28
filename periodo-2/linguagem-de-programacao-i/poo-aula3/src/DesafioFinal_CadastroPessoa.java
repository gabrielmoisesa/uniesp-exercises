import java.util.Scanner;

public class DesafioFinal_CadastroPessoa {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite seu nome:");
      String nome = scanner.nextLine();

      System.out.println("Digite sua idade:");
      int idade = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Digite sua cidade:");
      String cidade = scanner.nextLine();

      System.out.println("Digite seu salário:");
      double salario = scanner.nextDouble();
      scanner.nextLine();

      System.out.println("Digite seu ano de nascimento:");
      final int ANO_DE_NASCIMENTO = scanner.nextInt();

      System.out.println("======================");
      System.out.println("Relatório do Cadastro");
      System.out.println("======================");
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Cidade: " + cidade);
      System.out.println("Salário: R$ " + salario);
      System.out.println("Ano de nascimento: " + ANO_DE_NASCIMENTO);
    }
  }
}
