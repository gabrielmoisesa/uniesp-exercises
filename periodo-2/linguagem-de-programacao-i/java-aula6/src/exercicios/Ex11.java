package exercicios;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      login(scanner);
    }
  }

  public static void login(Scanner scanner) {
    System.out.print("Nome de usuário: ");
    String loginNome = scanner.nextLine();

    System.out.print("Senha: ");
    String loginSenha = scanner.nextLine();

    String nomeAdmin = "admin";
    String senhaAdmin = "1234";

    String mensagem = "Usuário ou senha incorretos.";

    if (loginNome.equals(nomeAdmin) && loginSenha.equals(senhaAdmin)) {
      mensagem = "Login realizado com sucesso.";
    }

    System.out.println(mensagem);
  }
}
