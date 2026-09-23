package exercicios;

import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      verificacaoCategoria(scanner);
    }
  }

  public static void verificacaoCategoria(Scanner scanner) {
    System.out.print("Informe o nome da categoria de produto: ");
    String input = scanner.nextLine().toLowerCase();

    String categoria;

    if (input.equals("eletrônicos") || input.equals("eletronicos")) {
      categoria = "Eletrônicos";
    } else if (input.equals("alimentos")) {
      categoria = "Alimentos";
    } else if (input.equals("roupas")) {
      categoria = "Roupas";
    } else if (input.equals("livros")) {
      categoria = "Livros";
    } else {
      System.out.println("Categoria não encontrada.");
      return;
    }

    System.out.println("Categoria encontrada: " + categoria);
  }
}
