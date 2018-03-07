package Zoo;

public abstract class Animal {
  private String name;
  private int age;
  private String gender;
  private int legs;

  public Animal(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String breed();
}
