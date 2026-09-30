package ex02_retangulo;

public class Main {
  public static void main(String[] args) {
    Retangulo retangulo = new Retangulo();

    retangulo.setAltura(10);
    retangulo.setLargura(20);

    System.out.println("Altura: " + retangulo.getAltura() + "\nLargura: " + retangulo.getLargura());
  }
}
