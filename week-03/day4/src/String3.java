public class String3 {
  public static void main(String[] args) {

    String newString = "Hello x I am x and x";
    System.out.println(charChanger(newString));

  }
  public static String charChanger(String word) {
    if (word.length() == 0) {
      return word;
    } else {
      return word.charAt(0) + "*" + charChanger(word.substring(1));
    }
  }
}
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".