package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  ArrayList<Aircraft> aircrafts = new ArrayList<>();
  int storedAmmo;
  int healthPoints;

  public Carrier (int storedAmmo, int healthPoints){
    this.storedAmmo = storedAmmo;
    this.healthPoints = healthPoints;
  }
  public void addAircraft (String type){
    if (type.equalsIgnoreCase("F16")){
      aircrafts.add(new Aircraft.F16());
    }else if (type.equalsIgnoreCase("F35")){
      aircrafts.add(new Aircraft.F35());
    }
  }
  public void fill (Aircraft aircraft){
    for (int i = 0; i < aircrafts.size(); i++) {
      aircrafts.get(i).fill(storedAmmo);
    }
  }
  public void fight (Carrier carrier){
    for (int i = 0; i < aircrafts.size(); i++) {
      healthPoints -= aircrafts.get(i).fight();
    }
  }
  public void getStatus (){
    System.out.println("HP: " + healthPoints + ", Aircraft count: " + aircrafts.size() +
            ", Ammo Storage: " + storedAmmo + ", Total damage: ");
    System.out.println("Aircrafts:");
    for (int i = 0; i < aircrafts.size(); i++) {
      aircrafts.get(i).getStatus();
    }
  }

  public static void main(String[] args) {
    Carrier carrier1 = new Carrier(4000,3000);
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F35");
    carrier1.addAircraft("f16");
    carrier1.addAircraft("f35");
    carrier1.getStatus();
  }

}
