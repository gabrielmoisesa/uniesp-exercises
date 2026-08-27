import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex17_DataDeNascimento {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Digite o dia do seu nascimento:");
      int diaDeNascimento = input.nextInt();

      System.out.println("Digite o mês do seu nascimento:");
      int mesDeNascimento = input.nextInt();

      System.out.println("Digite o seu ano de nascimento:");
      int anoDeNascimento = input.nextInt();

      LocalDate dataDeNascimento = LocalDate.of(anoDeNascimento, mesDeNascimento, diaDeNascimento);
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      System.out.println("Data de nascimento: " + dataDeNascimento.format(formatador));
    }
  }
}
