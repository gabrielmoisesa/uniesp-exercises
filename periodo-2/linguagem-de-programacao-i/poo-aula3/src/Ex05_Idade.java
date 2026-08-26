import java.util.Scanner;

public class Ex05_Idade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o seu nome:");
    String nome = input.nextLine();

    System.out.println("Digite a sua idade:");
    int idade = input.nextInt();

    System.out.println("\nOlá, " + nome + "!");
    System.out.println("Você tem " + idade + " anos");
  }
}
