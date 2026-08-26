import java.time.LocalDate;
import java.util.Scanner;

public class Ex06_AnoDeNascimento {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("\nDigite o seu nome:");
      String nome = input.nextLine();

      System.out.println("\nDigite o seu ano  de nascimento:");
      int anoDeNascimento = input.nextInt();

      int idade = LocalDate.now().getYear() - anoDeNascimento;

      System.out.println("\nOlá, " + nome + "!");
      System.out.println("Você tem: " + idade + " anos.");
    }
  }
}
