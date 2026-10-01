package ex08_this;

public class Contato {
  private String nome;
  private String telefone;

  public String getNome() {
    return nome;
  }

  // Setters utilizando "this":
  // A utilização de this é necessária quando o parâmetro tem o
  // mesmo nome do atributo pois sem o "this", a linguagem atribuiria
  // o parâmetro a ele mesmo, e não ao atributo da classe. Então, para
  // explicitar que o atributo da classe será modificado, é adicionado
  // o "this", que significa que está acessando algo do objeto atual.
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
