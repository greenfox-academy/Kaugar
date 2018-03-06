package GardenApp;

public class Flower {
  double water;
  String color;

  public void needswater() {
    if (water < 5) {
      System.out.println("The " + color + " Flower needs water");
    }else {
      System.out.println("The " + color + "Flower doesn't need water");
    }
  }
  public void watering (double water){
    this.water += 0.75 * water;
  }
}
