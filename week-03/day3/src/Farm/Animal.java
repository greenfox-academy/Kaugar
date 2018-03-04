package Farm;

public class Animal {
  int hunger;
  int thirst;
  public Animal(){
    hunger = 50;
    thirst = 50;
  }
  public void eat(){
    hunger--;
  }
  public void drink(){
    thirst--;
  }
  public void play(){
    hunger++;
    thirst++;
  }
  public int getHunger(){
    return hunger;
  }
}
