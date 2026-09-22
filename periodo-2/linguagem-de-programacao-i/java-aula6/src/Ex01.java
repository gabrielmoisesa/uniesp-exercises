import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      maiorDeDoisNumeros(scanner);
    }
  }

  public static void maiorDeDoisNumeros(Scanner scanner) {
    System.out.print("Digite o número 1: ");
    int n1 = scanner.nextInt();
    System.out.print("Digite o número 2: ");
    int n2 = scanner.nextInt();

    if (n1 > n2) {
      System.out.println("O número " + n1 + " é maior que " + n2);
    } else if (n1 < n2) {
      System.out.println("O número " + n2 + " é maior que " + n1);
    } else {
      System.out.println("\nOs números " + n1 + " e " + n2 + " são iguais. ");
    }
  }
}
