package ex07_cell;

public class Main {
  public static void main(String[] args) {
    Android android17 = new Android();
    Android android18 = new Android();

    android17.setNome("Android 17");
    android17.setAltura(1.78f);
    android17.setPeso(68.0f);
    android17.setPoderDeLuta(1000000);

    android18.setNome("Android 18");
    android18.setAltura(1.69f);
    android18.setPeso(55.0f);
    android18.setPoderDeLuta(1000000);

    PerfectAndroid cell = new PerfectAndroid();
    cell.setNome("Cell");

    cell.absorverAndroid(android17);
    cell.absorverAndroid(android18);

    System.out.println("Androids absorvidos pelo Cell:");
    for (Android android : cell.getAndroides()) {
      System.out.println("=== " + android.getNome() + " ===");
      System.out.println("Altura: " + android.getAltura());
      System.out.println("Peso: " + android.getPeso());
      System.out.println("Poder de luta: " + android.getPoderDeLuta());
    }
  }
}
