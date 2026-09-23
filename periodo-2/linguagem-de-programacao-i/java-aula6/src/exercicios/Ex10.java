package exercicios;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      comparacaoSenha(scanner);
    }
  }

  public static void comparacaoSenha(Scanner scanner) {
    System.out.print("Digite a senha: ");
    String input = scanner.nextLine();

    String senha = "Java123";
    String mensagem = "Senha incorreta";

    if (input.equals(senha)) {
      mensagem = "Acesso permitido.";
    }

    System.out.println(mensagem);
  }
}
