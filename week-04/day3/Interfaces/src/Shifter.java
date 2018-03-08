public class Shifter implements CharSequence {
  private String string;
  private int modifier;

  public Shifter(String string, int modifier){
    this.string = string;
    this.modifier = modifier;
  }
  @Override
  public int length() {
    return 0;
  }


  @Override
  public char charAt(int index) {
    return string.charAt(index+modifier);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  public static void main(String[] args) {
    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));

    
  }
}
