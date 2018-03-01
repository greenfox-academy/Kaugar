public class String2 {
  public static void main(String[] args) {

    String newString = "Hello x I am x and x";
    System.out.println(charChanger(newString));

  }
  public static String charChanger(String word) {
    char temp;
    if (word.length() == 0) {
      return word;
    } else {
      if ('x' == word.charAt(0)) {
        temp = 0;
      } else {
        temp = word.charAt(0);
      }
      return temp + charChanger(word.substring(1));
    }
  }
}
// Given a string, compute recursively a new string where all the 'x' chars have been removed.