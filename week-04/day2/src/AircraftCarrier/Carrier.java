package AircraftCarrier;

import java.util.ArrayList;

public class Carrier {
  private ArrayList<Aircraft> aircrafts = new ArrayList<>();
  private int storedAmmo;
  private int healthPoints;
  private int totalDamage;

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
  public void fill (){
    if (storedAmmo == 0){
      System.out.println("Sorry you ran out of ammo!");
    } else {
      for (int i = 0; i < aircrafts.size(); i++) {
        storedAmmo -= aircrafts.get(i).refill();
      }
    }
  }
  public void fight (Carrier enemycarrier){
    for (int i = 0; i < aircrafts.size(); i++) {
      enemycarrier.healthPoints -= this.aircrafts.get(i).fight();
      this.aircrafts.get(i).setAmmo(0);
    }
  }
  public void getStatus (){
    if (healthPoints == 0){
      System.out.println("It's dead Jim :(");
    }else {
      for (int i = 0; i < aircrafts.size(); i++) {
      totalDamage += aircrafts.get(i).getAmmo()* aircrafts.get(i).getBaseDamage();
      }
      System.out.println("HP: " + healthPoints + ", Aircraft count: " + aircrafts.size() +
            ", Ammo Storage: " + storedAmmo + ", Total damage: " + totalDamage);
      System.out.println("Aircrafts:");
      for (int i = 0; i < aircrafts.size(); i++) {
        aircrafts.get(i).getStatus();
      }
    }
  }

  public static void main(String[] args) {
    Carrier carrier1 = new Carrier(4000,3000);
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F35");
    carrier1.addAircraft("f16");
    carrier1.addAircraft("f35");
    carrier1.getStatus();
    carrier1.fill();
    carrier1.getStatus();
    Carrier carrier2 = new Carrier(2000,1000);
    carrier2.addAircraft("f16");
    carrier2.addAircraft("f35");
    carrier2.fill();
    carrier2.getStatus();

    carrier1.fight(carrier2);
    carrier2.getStatus();
  }

}
