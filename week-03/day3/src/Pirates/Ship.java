package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List <Pirate> crew = new ArrayList<>();
  String shipName;
  boolean winner;

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
  public int numberofrumCaptain (){
    return this.crew.get(0).drunkness;
  }

  public int calculatedScore (){
    return this.numberOfAlivePirates()-this.numberofrumCaptain();
  }

  public boolean battle (Ship othership) {
    if (calculatedScore() > othership.calculatedScore()) {
      System.out.println("The winner is: " + this.shipName);
      Random random = new Random();
      int rand2 = random.nextInt(this.crew.size());
      for (int i = 0; i < rand2; i++) {
        othership.crew.get(i).isDead = true;
      }
      for (int i = 0; i < this.crew.size(); i++) {
        int rand3 = random.nextInt(4);
        this.crew.get(i).drunkness = rand3;
      }
      return this.winner = true;

    }else{
      System.out.println("The winner is: " + othership.shipName);
      Random random = new Random();
      int rand2 = random.nextInt(othership.crew.size());
      for (int i = 0; i < rand2; i++) {
        this.crew.get(i).isDead = true;
      }
      for (int i = 0; i < othership.crew.size(); i++) {
        int rand3 = random.nextInt(4);
        othership.crew.get(i).drunkness = rand3;
      }
    }
    return winner = true;
  }

  @Override
  public String toString() {
    return "The ship " + this.shipName + ": The captain consumed: " + numberofrumCaptain() +
            " bottles of rum. Is he died?: " + crew.get(0).isDead  +
            " There are " + this.numberOfAlivePirates() + " alive pirates on board.";
  }
}
