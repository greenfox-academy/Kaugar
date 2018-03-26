import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
  public static void main(String[] args) {
    // Write a Stream Expression to convert a char array to a string!
    char[] input = {'H','e','l','l','o'};

    /*String newString = Arrays.stream(input)
            .map(n -> n)
            .collect()*/

    System.out.println(String.valueOf(input));
  }
}
