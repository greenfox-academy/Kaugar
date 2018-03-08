import java.util.HashMap;

public class CountLetters {

  public static HashMap counLetters (String word){

    HashMap<Character, Integer> hmap = new HashMap<>();

    for (int i = 0; i < word.length(); i++) {
      if (hmap.containsKey(word.charAt(i))){
        hmap.put(word.charAt(i), hmap.get(word.charAt(i))+1);
      } else {
        hmap.put(word.charAt(i), 1);
      }
    }
    return hmap;
  }

  public static void main(String[] args) {

    System.out.println(counLetters("Hello"));
  }
}
