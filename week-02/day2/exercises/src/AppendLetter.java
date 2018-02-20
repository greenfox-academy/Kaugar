import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    public static List appendA (List<String> words){
        List<String> words2 = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i) + "a");
        }
        return words;
    }

}

// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"
