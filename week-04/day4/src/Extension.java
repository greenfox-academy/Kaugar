import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    int sum = a + b;
    return sum;
  }

  int maxOfThree(int a, int b, int c) {
    if (a >= b && a >= c)
      return a;
    else if (b >= c && b >= a)
      return b;
    else
      return c;
  }

  public double median (List<Double> pool) {
    if (pool.size() % 2 == 1)
      return pool.get((pool.size())/2);
    else
      return pool.get(pool.size()/2) + pool.get(pool.size()/2-1)/ 2;

  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split(""+c));
        i+=2;
        length+=2;
      }
    }
    return teve;
  }
}
