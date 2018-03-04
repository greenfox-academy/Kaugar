package Pirates;

public class PirateMain {
  public static void main(String[] args) {
    Pirate pirate1 = new Pirate("DirtyDerek");
    Pirate pirate2 = new Pirate("WidowMaker");


    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();
    pirate1.die();

    System.out.println(pirate1.getName() + " is level " + pirate1.getDrunkness() + " drunk");

    pirate1.howItGoingMate();

    pirate1.brawl(pirate2);
    System.out.println(2/3);

    System.out.println(pirate1);

    Ship ship1 = new Ship();
    ship1.shipName = "BlackPearl";
    ship1.fillShip();
    System.out.println(ship1);
    Ship ship2 = new Ship();
    ship2.shipName = "WhitePearl";
    ship2.fillShip();
    System.out.println(ship2);

    ship1.battle(ship2);
    System.out.println(ship1);
    System.out.println(ship2);

  }
}
