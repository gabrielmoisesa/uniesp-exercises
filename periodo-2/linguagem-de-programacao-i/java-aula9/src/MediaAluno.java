import java.util.Scanner;

public class MediaAluno {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double primeiraNota = scanner.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double segundaNota = scanner.nextDouble();

    double media = calculaMedia(primeiraNota, segundaNota);
    System.out.println("Média do aluno: " + media);

    scanner.close();
  }

  public static double calculaMedia(double n1, double n2) {
    double media = (n1 + n2) / 2;
    return media;
  }
}
