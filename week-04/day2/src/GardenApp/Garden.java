package GardenApp;

import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> plants;

  public Garden () {
    this.plants = new ArrayList<>();
  }
  public void addTree (Plant.Tree tree){
    plants.add(tree);
  }
  public void addFlower (Plant.Flower flower){
    plants.add(flower);
  }
  public void watering (double waterToGarden){

    System.out.println("\n" + "Watering with " + waterToGarden);
    int counter = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).water < plants.get(i).needOfWater){
        counter++;
        double waterToPlants = waterToGarden/counter;
        plants.get(i).watering(waterToPlants);
      }
    }

    for (int i = 0; i < plants.size() ; i++) {
      plants.get(i).needsWater();
    }
  }

  public static void main(String[] args) {
    Garden garden1 = new Garden();

    Plant.Flower flower1 = new Plant.Flower("yellow");
    garden1.addFlower(flower1);
    Plant.Flower flower2 = new Plant.Flower("blue");
    garden1.addFlower(flower2);
    Plant.Tree tree1 = new Plant.Tree("purple");
    garden1.addTree(tree1);
    Plant.Tree tree2 = new Plant.Tree("orange");
    garden1.addTree(tree2);

    garden1.watering(40);
    garden1.watering(70);



  }
}
