package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List <Pirate> crew = new ArrayList<>();
  String shipName;

  public Ship(){
    this.shipName = shipName;
  }

  public void addPirate (Pirate pirate){
    crew.add(pirate);
  }

  public void fillShip (){
    Pirate captain = new Pirate("Jack Sparrow");

    Random random = new Random();
    int rand = random.nextInt(50)+1;
    for (int i = 0; i < rand; i++) {
      String name = "Pirate " + i;
      Pirate pirate = new Pirate(name);
      this.crew.add(pirate);
      }

  }
  public int numberOfAlivePirates (){
    int alivePirates = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (!crew.get(i).isDead){
        alivePirates++;
      }
    }
    return alivePirates;
  }

  @Override
  public String toString() {
    return "The ship " + this.shipName + ": The captain consumed: " + this.crew.get(0).drunkness +
            " bottles of rum. Is he died?: " + crew.get(0).isDead  +
            " There are " + this.numberOfAlivePirates() + " alive pirates on board.";
  }
}
