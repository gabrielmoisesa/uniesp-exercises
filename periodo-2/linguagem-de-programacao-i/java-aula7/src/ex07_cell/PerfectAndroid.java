package ex07_cell;

import java.util.ArrayList;
import java.util.List;

public class PerfectAndroid {
  private String nome;
  private List<Android> androides = new ArrayList<>();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Android> getAndroides() {
    return androides;
  }

  public void absorverAndroid(Android android) {
    this.androides.add(android);
  }
}
