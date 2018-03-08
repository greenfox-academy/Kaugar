public class Sharpie {
  private String color;
  private int width;
  private int inkAmount;
  public Sharpie (String color, int width){
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }
  public void use (){
    inkAmount--;
  }
  public int getInkamount(){
    return inkAmount;
  }
}
