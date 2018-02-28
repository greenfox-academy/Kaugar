public class Animal {
  int hunger = 50;
  int thirst = 50;
  public Animal(){
    Animal monkey = new Animal();
    Animal tiger = new Animal();
  }
  public void eat(){
    hunger--;
  }
  public void drink(){
    thirst--;
  }
  public void play(){
    hunger++;
    thirst--;
  }
}
