package Pirates;

public class Pirate {
  String name;
  boolean isDead;
  int drunkness;
  boolean passOut;


  public Pirate (String name) {
    this.name = name;
    drunkness = 0;
    isDead = false;
    passOut = false;
  }
  public void drinkSomeRum (){
    if (isDead){
      System.out.println("He is dead");
    }
    drunkness++;
  }
  public void howItGoingMate (){
    if (isDead){
      System.out.println("He is dead");
    }
    else if (drunkness < 4){
      System.out.println("Pour me anudder!");
    }else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
  }
  public boolean die (){
    return isDead = true;
  }
  public void brawl (Pirate pirate){
    double random = Math.random();

    if (pirate.isDead){
      System.out.println("Haha, you are already dead!");
    }else if (random < 0.3){
      pirate.isDead = true;
      System.out.println("Haha, I won you bastard!");
    }else if (random < 0.7){
      this.isDead = true;
      System.out.println("Oh i got a hit. Attacker pirate died");
    }else if (random >= 0.7){
      pirate.passOut = true;
      this.passOut = true;
      System.out.println("Both pirates passed out");
    }
  }

  public String getName() {
    return name;
  }

  public int getDrunkness() {
    return drunkness;
  }
  @Override
  public String toString() {
    return
            " ### His name is '" + name + '\'' +
                    ", intoxication = " + drunkness +
                    ", is passed out?: " + passOut +
                    ", is he dead?: " + isDead +
                    " ### ";

  }
}
