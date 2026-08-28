package Ex20_SistemaAluno;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite seu nome:");
      String nome = scanner.nextLine();

      System.out.println("Digite sua idade:");
      int idade = scanner.nextInt();

      System.out.println("Digite seu ano de nascimento:");
      int anoDeNascimento = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Digite seu curso:");
      String curso = scanner.nextLine();

      System.out.println("Digite sua nota:");
      int nota = scanner.nextInt();

      System.out.println("===================");
      System.out.println("Relatório do aluno");
      System.out.println("===================");
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Ano de nascimento: " + anoDeNascimento);
      System.out.println("Curso: " + curso);
      System.out.println("Nota: " + nota);
    }
  }
}
