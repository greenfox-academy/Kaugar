import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...


    System.out.println(dominoes);
    System.out.println(sorting(dominoes));
  }
  public static List<Domino> sorting (List<Domino> dominoArrayList){
    for (int i = 0; i < dominoArrayList.size(); i++) {
      for (int j = 1; j < dominoArrayList.size(); j++) {
        if (dominoArrayList.get(i).getValues()[1] == dominoArrayList.get(j).getValues()[0]){
          dominoArrayList.add(i+1,dominoArrayList.get(j));
          dominoArrayList.remove(j+1);
        }
      }
    }
    return dominoArrayList;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
