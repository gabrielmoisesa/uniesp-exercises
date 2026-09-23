package exercicios;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      turnoEstudo(scanner);
    }
  }

  public static void turnoEstudo(Scanner scanner) {
    System.out.print("Digite o seu turno (M/V/N): ");
    String opcao = scanner.nextLine().toLowerCase();
    String turno;

    if (opcao.equals("m")) {
      turno = "Matutino";
    } else if (opcao.equals("v")) {
      turno = "Vespertino";
    } else if (opcao.equals("n")) {
      turno = "Noturno";
    } else {
      System.out.println("Turno inválido.");
      return;
    }

    System.out.println("Turno: " + turno);
  }
}
