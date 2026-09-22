import java.util.Scanner;

public class Questoes {
    static Scanner scanner = new Scanner(System.in);

  // ============
  // Exercício 1
  // ============
    public static void exercicio1() {
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
