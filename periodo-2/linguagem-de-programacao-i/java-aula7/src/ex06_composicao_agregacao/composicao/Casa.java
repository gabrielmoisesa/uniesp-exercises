package ex06_composicao_agregacao.composicao;

public class Casa {
  private Comodo quarto;

  public Casa(String tipoComodo) {
    this.quarto = new Comodo(tipoComodo);
  }

  public Comodo getQuarto() {
    return quarto;
  }
}
