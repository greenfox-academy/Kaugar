public class String1 {
  public static void main(String[] args) {

    String test = "Mx name is xIx";
    System.out.println(charChanger(test));


  }

  public static String charChanger(String word) {
    char temp;
    if (word.length() == 0) {
      return word;
    } else {
      if ('x' == word.charAt(0)) {
        temp = 'y';
      } else {
        temp = word.charAt(0);
      }
      return temp + charChanger(word.substring(1));
    }
  }

}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.