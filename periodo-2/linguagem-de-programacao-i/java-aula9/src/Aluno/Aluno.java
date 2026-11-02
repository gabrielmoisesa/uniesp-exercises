package Aluno;

public class Aluno {
  private String nome;
  private String matrícula;
  private String disciplina;
  private double nota1;
  private double nota2;
  private double nota3;
  private double média;

  public Aluno(String nome, String matrícula) {
    this.nome = nome;
    this.matrícula = matrícula;
    nota1 = 0;
    nota2 = 0;
    nota3 = 0;
    média = 0;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatrícula() {
    return matrícula;
  }

  public void setMatrícula(String matrícula) {
    this.matrícula = matrícula;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  public double getNota1() {
    return nota1;
  }

  public void setNota1(double nota1) {
    this.nota1 = nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public void setNota2(double nota2) {
    this.nota2 = nota2;
  }

  public double getNota3() {
    return nota3;
  }

  public void setNota3(double nota3) {
    this.nota3 = nota3;
  }

  public double getMédia() {
    return média;
  }

  public void setMédia(double média) {
    this.média = média;
  }

  public void calcularMedia() {
    média = (nota1 + nota2 + nota3) / 3;
    String status = média >= 7 ? "aprovado" : "reprovado";
    System.out.println("Aluno " + nome + ": " + status);
  }
}
