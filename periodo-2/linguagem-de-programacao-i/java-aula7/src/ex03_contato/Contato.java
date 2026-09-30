package ex03_contato;

public class Contato {
  private String nome;
  private String telefone;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void exibeContato() {
    System.out.println("=== Contato ===\nNome: " + nome + "\nTelefone: " + telefone);
  }
}
