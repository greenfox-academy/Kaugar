package PetrolStation;

public class PetrolStation {
  public static void main(String[] args) {
    Station shell = new Station();
    Car honda = new Car();

    shell.refill(honda);

    System.out.println("Gas left: "+ shell.gasAmount);
    System.out.println("Honda has: " + honda.gasAmount + " l gas");
  }
}
