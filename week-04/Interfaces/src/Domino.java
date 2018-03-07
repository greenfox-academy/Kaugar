import Printable.Printable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Domino implements Comparable<Domino>,Printable {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  public static void main(String[] args) {

    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    Collections.sort(dominoes);
    System.out.println(dominoes);

  }

  @Override
  public int compareTo(Domino domino){
    if(values[0] == domino.values[0])
      return 0;
    else if(values[0]>domino.values[0])
      return 1;
    else
      return -1;
  }

  @Override
  public void printAllFields() {
    
  }
}
