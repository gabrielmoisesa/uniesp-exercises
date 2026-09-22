package exercicios;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      aprovacaoDoAluno(scanner);
    }
  }

  public static void aprovacaoDoAluno(Scanner scanner) {
    System.out.print("Digite a nota do aluno: ");
    double nota = scanner.nextDouble();
    String status;

    if (nota >= 7) {
      status = "Aprovado";
    } else if (nota >= 5) {
      status = "Recuperação";
    } else {
      status = "Reprovado";
    }

    System.out.printf("Nota: %.2f%n", nota);
    System.out.println("Situação: " + status);
  }
}