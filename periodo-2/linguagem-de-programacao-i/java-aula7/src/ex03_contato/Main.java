package ex03_contato;

public class Main {
  public static void main(String[] args) {
    Contato contato1 = new Contato();

    contato1.setNome("Faro");
    contato1.setTelefone("(83) 3867-9461");

    contato1.exibeContato();
  }
}
