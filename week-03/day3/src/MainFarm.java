import java.util.ArrayList;
import java.util.List;

public class MainFarm {
  public static void main(String[] args) {
    Farm farm = new Farm();

    for (int i = 0; i < 6; i++) {
      farm.breed();
    }
    System.out.println("We have: " + farm.getAnimalList().size() + " animals");
    System.out.println("Free slots: " + farm.freeslots);

    farm.animalList.get(1).play();
    farm.animalList.get(1).play();


    for (int i = 0; i < farm.getAnimalList().size(); i++) {
      System.out.println(farm.animalList.get(i).getHunger());
    }
    farm.slaugther();
    System.out.println(farm.getAnimalList().size());
  }

}
