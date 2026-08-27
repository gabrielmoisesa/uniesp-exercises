import java.util.Scanner;

public class Ex18_SalarioMinimo {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      final double SALARIO_MINIMO = 1412.00;

      System.out.println("Digite o seu salário:");
      double salario = input.nextDouble();

      System.out.println("A diferença entre o seu salário e o salário mínimo é de: R$ " + (salario - SALARIO_MINIMO));
    }
  }
}
