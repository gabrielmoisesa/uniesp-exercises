package ex06_composicao_agregacao.agregacao;

public class Main {
  public static void main(String[] args) {
    Celular celular1 = new Celular();
    Tela tela1 = new Tela();

    tela1.setTipo("AMOLED");
    celular1.setModelo("POCO X8 Pro");
    celular1.setTela(tela1);

    System.out.println("Modelo: " + celular1.getModelo());
    System.out.println("Tipo de tela: " + celular1.getTela().getTipo());
  }
}
