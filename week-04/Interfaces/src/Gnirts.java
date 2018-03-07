public class Gnirts implements CharSequence {
  private String string;

  public Gnirts (String string){
    this.string = string;
  }
  @Override
  public int length() {
    return 0;
  }


  @Override
  public char charAt(int index) {
    return string.charAt(string.length()-index-1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));

    
  }
}
