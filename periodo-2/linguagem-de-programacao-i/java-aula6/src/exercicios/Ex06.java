package exercicios;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      classificacaoIdade(scanner);
    }
  }

  public static void classificacaoIdade(Scanner scanner) {
    System.out.print("Digite a idade: ");
    int idade = scanner.nextInt();
    String classificacao;

    if (idade >= 60) {
      classificacao = "Idoso";
    } else if (idade >= 18) {
      classificacao = "Adulto";
    } else if (idade >= 13) {
      classificacao = "Adolescente";
    } else {
      classificacao = "Criança";
    }

    System.out.println("Classificação de idade: " + classificacao);
  }
}
