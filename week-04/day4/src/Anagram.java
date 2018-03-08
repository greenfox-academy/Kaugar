import java.util.Arrays;

public class Anagram {

  public boolean anagram (String word1, String word2){
    if (word1.length() != word2.length())
    word1=word1.toLowerCase();
    word2=word2.toLowerCase();
    char[] charfirst = word1.toCharArray();
    char[] charsecond = word2.toCharArray();
    Arrays.sort(charfirst);
    Arrays.sort(charsecond);
    String sortedword1 = new String(charfirst);
    String sortedword2 = new String(charsecond);
    return sortedword1.equals(sortedword2);
  }
}
