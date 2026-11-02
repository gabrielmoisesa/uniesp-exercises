package Produto;

public class Produto {
  private String nome;
  private double preço;

  public Produto(String n, double p) {
    nome = n;
    preço = p;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreço() {
    return preço;
  }

  public void setPreço(double preço) {
    this.preço = preço;
  }
}
