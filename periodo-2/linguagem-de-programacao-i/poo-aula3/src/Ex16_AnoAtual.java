import java.time.LocalDate;
import java.util.Scanner;

public class Ex16_AnoAtual {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Digite o seu ano de nascimento:");

      int anoDeNascimento = input.nextInt();
      int anoAtual = LocalDate.now().getYear();
      int idade = anoAtual - anoDeNascimento;

      System.out.println("Você tem " + idade + " anos.");
    }
  }
}
