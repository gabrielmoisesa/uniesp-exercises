import java.util.Scanner;

public class MiniCalculadora {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double n1 = scanner.nextDouble();
    System.out.print("Digite o segundo número: ");
    double n2 = scanner.nextDouble();

    menu(scanner, n1, n2);
    scanner.close();
  }

  public static void menu(Scanner scanner, double n1, double n2) {
    System.out.println("\n1 - Somar\n2 - Subtrair\n3 - Dividir\n4 - Multiplicar\n5 - Sair");
    System.out.print("Escolha: ");
    int opcao = scanner.nextInt();

    if (opcao == 1) {
      System.out.println("Resultado: " + somar(n1, n2));
    } else if (opcao == 2) {
      System.out.println("Resultado: " + subtrair(n1, n2));
    } else if (opcao == 3) {
      System.out.println("Resultado: " + dividir(n1, n2));
    } else if (opcao == 4) {
      System.out.println("Resultado: " + multiplicar(n1, n2));
    } else if (opcao == 5) {
      return;
    } else {
      System.out.println("Opção inválida.");
    }

    menu(scanner, n1, n2);
  }

  public static double somar(double n1, double n2) {
    return n1 + n2;
  }

  public static double subtrair(double n1, double n2) {
    return n1 - n2;
  }

  public static double dividir(double n1, double n2) {
    return n1 / n2;
  }

  public static double multiplicar(double n1, double n2) {
    return n1 * n2;
  }
}
