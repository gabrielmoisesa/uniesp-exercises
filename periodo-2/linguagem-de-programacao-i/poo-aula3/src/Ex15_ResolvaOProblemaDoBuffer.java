import java.util.Scanner;

public class Ex15_ResolvaOProblemaDoBuffer {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Digite a idade:");
      int idade = input.nextInt();
      input.nextLine();

      System.out.println("Digite o nome:");
      String nome = input.nextLine();

      System.out.println("Digite a cidade:");
      String cidade = input.nextLine();

      System.out.println("Idade: " + idade);
      System.out.println("Nome: " + nome);
      System.out.println("Cidade: " + cidade);
    }
  }
}
