package GardenApp;

public class Plant {
  String type;
  double water = 0;
  String color;
  int needOfWater;
  double absorbing;

  public void needsWater() {
    if (water < needOfWater) {
      System.out.println("The " + color + " " + type + " needs water");
    }else {
      System.out.println("The " + color + " " + type + " doesn't need water");
    }
  }
  public void watering (double water){
    this.water += absorbing * water;
  }

  public static class Tree extends Plant{

    public Tree(String color) {
      super.type = "Tree";
      super.color = color;
      super.needOfWater = 10;
      super.absorbing = 0.4;
    }
  }

  public static class Flower extends Plant{

    public Flower(String color) {
      super.type = "Flower";
      super.color = color;
      super.needOfWater = 5;
      super.absorbing = 0.75;
    }
  }
}
