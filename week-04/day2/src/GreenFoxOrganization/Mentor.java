package GreenFoxOrganization;

public class Mentor extends Person {

  String level;

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + level + " mentor.");
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers!");
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    this.level = "intermediate";
  }
}
