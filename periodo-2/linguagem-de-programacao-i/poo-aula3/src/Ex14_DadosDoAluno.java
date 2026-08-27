import java.util.Scanner;

public class Ex14_DadosDoAluno {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Digite o nome do aluno:");
      String nome = input.nextLine();

      System.out.println("Digite a idade do aluno:");
      int idade = input.nextInt();

      System.out.println("Digite a nota do aluno:");
      double nota = input.nextDouble();

      System.out.println("================");
      System.out.println("Dados do Aluno");
      System.out.println("================");
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Nota: " + nota);
    }
  }
}
