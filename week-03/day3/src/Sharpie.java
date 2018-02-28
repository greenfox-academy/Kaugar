public class Sharpie {
  String color;
  double width;
  int amount = 100;
  public Sharpie (String color, float width){
    Sharpie first = new Sharpie("blue", 3);
    Sharpie second = new Sharpie("pink",5);
  }
  public void use (){
    amount--;
  }
}
