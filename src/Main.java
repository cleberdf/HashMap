
// Importando HashMap para classe
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    HashMap<String, Integer> pessoas = new HashMap<String, Integer>();

    pessoas.put("João", 25);
    pessoas.put("José", 30);
    pessoas.put("Joaquim", 35);
    pessoas.put("Jomar", 40);

    for (String i : pessoas.keySet()) {
      System.out.println(" Nome " + i + " Idade " + pessoas.get(i));
    }
  }

}