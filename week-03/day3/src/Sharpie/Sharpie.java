package Sharpie;

public class Sharpie {
  String color;
  double width;
  int amount = 100;
  public Sharpie (String color, float width){
    Sharpie first = new Sharpie("blue", 3);
    Sharpie second = new Sharpie("pink",5);
    Sharpie third = new Sharpie("red",2);
    Sharpie fourth = new Sharpie("grey",5);
  }
  public void use (){

    amount--;
  }
  public void useAll(){
    this.amount = 0;
  }
  public int getAmount (){
    return amount;
  }
}
