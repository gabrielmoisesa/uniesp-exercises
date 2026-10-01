package ex04_principal;

import java.util.Scanner;

import ex03_contato.Contato;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Contato contato = new Contato();

    System.out.print("Digite o nome do contato: ");
    contato.setNome(scanner.nextLine());

    System.out.print("Digite o telefone do contato: ");
    contato.setTelefone(scanner.nextLine());

    contato.exibeContato();
    scanner.close();
  }
}
