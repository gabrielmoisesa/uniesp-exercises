import java.util.Scanner;

public class Ex04_NomeDoUsuario {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Digite o seu nome:");
      String nomeUsuario = input.nextLine();

      System.out.println("Olá, " + nomeUsuario + "!");
      System.out.println("Seja bem-vindo ao Java!");
    }
  }
}
