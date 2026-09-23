package exercicios;

import java.util.Scanner;

public class Ex08 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      diaDaSemana(scanner);
    }
  }

  public static void diaDaSemana(Scanner scanner) {
    System.out.print("Digite um número inteiro de 1 a 7: ");
    int opcao = scanner.nextInt();
    String diaDaSemana;

    switch (opcao) {
      case 1:
        diaDaSemana = "Domingo";
        break;
      case 2:
        diaDaSemana = "Segunda-feira";
        break;
      case 3:
        diaDaSemana = "Terça-feira";
        break;
      case 4:
        diaDaSemana = "Quarta-feira";
        break;
      case 5:
        diaDaSemana = "Quinta-feira";
        break;
      case 6:
        diaDaSemana = "Sexta-feira";
        break;
      case 7:
        diaDaSemana = "Sábado";
        break;
      default:
        System.out.println("Opção inválida.");
        return;
    }

    System.out.println("Dia da semana: " + diaDaSemana);
  }
}
