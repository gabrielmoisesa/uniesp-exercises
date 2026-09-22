package exercicios;

import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      salarioAumento(scanner);
    }
  }

  public static void salarioAumento(Scanner scanner) {
    System.out.print("Digite o salário: ");
    double salario = scanner.nextDouble();
    double porcentagemAumento = salario <= 2000 ? 0.15 : 0.10;

    double valorAumento = salario * porcentagemAumento;
    double novoSalario = salario + valorAumento;

    System.out.println("\n=== Salário e Aumento ===");
    System.out.printf("Salário original: %.2f $%n", salario);
    System.out.printf("Valor do aumento: %.2f $%n", valorAumento);
    System.out.printf("Novo salário: %.2f $%n", novoSalario);
  }
}
