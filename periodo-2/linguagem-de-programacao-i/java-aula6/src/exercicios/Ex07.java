package exercicios;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      calculadoraComSwitch(scanner);
    }
  }

  public static void calculadoraComSwitch(Scanner scanner) {
    System.out.println("=== Calculadora com Switch ===");

    System.out.print("Digite o primeiro número: ");
    double num1 = scanner.nextDouble();

    System.out.print("Digite o segundo número: ");
    double num2 = scanner.nextDouble();

    System.out.println("\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
    int opcao = scanner.nextInt();
    double resultado = 0;

    switch (opcao) {
      case 1:
        resultado = num1 + num2;
        break;
      case 2:
        resultado = num1 - num2;
        break;
      case 3:
        resultado = num1 * num2;
        break;
      case 4:
        if (num2 == 0) {
          System.out.println("Não é possível dividir por zero.");
          return;
        }
        resultado = num1 / num2;
        break;
      default:
        System.out.println("Opção inválida.");
        return;
    }

    System.out.printf("\nResultado: %.2f%n", resultado);
  }
}
