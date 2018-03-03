import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> animalList = new ArrayList<>();
  int freeslots = 10;

  public void breed (){
    if (this.freeslots > 0){
      animalList.add(new Animal());
    }
    this.freeslots--;
  }
  public void slaugther (){
    int leastHunger = animalList.get(0).getHunger();
    int leastHungerindex= 0;
    for (int i = 1; i <animalList.size()-1; i++) {
      if (animalList.get(i).getHunger() < leastHunger){
        leastHungerindex = i;
      }
    }
    animalList.remove(leastHungerindex);
  }

  public List<Animal> getAnimalList() {
    return animalList;
  }
}
