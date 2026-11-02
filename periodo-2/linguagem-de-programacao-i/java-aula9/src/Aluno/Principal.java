package Aluno;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Nome: ");
      String nome = scanner.nextLine();

      System.out.print("Matrícula: ");
      String matrícula = scanner.nextLine();

      System.out.print("Disciplina: ");
      String disciplina = scanner.nextLine();

      System.out.print("Nota 1: ");
      double nota1 = scanner.nextDouble();

      System.out.print("Nota 2: ");
      double nota2 = scanner.nextDouble();

      System.out.print("Nota 3: ");
      double nota3 = scanner.nextDouble();

      Aluno aluno = new Aluno(nome, matrícula);
      aluno.setDisciplina(disciplina);
      aluno.setNota1(nota1);
      aluno.setNota2(nota2);
      aluno.setNota3(nota3);
      aluno.calcularMedia();

      String status = aluno.getMédia() >= 7 ? "Aprovado" : "Reprovado";
      System.out.println("\n--- Relatório do aluno ---");
      System.out.println("Nome: " + aluno.getNome());
      System.out.println("Matrícula: " + aluno.getMatrícula());
      System.out.println("Disciplina: " + aluno.getDisciplina());
      System.out.println("Nota 1: " + aluno.getNota1());
      System.out.println("Nota 2: " + aluno.getNota2());
      System.out.println("Nota 3: " + aluno.getNota3());
      System.out.println("Média: " + aluno.getMédia());
      System.out.println("Status: " + status);
    }
  }
}
