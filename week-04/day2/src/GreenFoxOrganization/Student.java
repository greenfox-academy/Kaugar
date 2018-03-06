package GreenFoxOrganization;

public class Student extends Person {
  String previousOrganization;
  int skippedDays;

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old "
            + gender + " from " + previousOrganization + " who skipped "
            + skippedDays + " days from the course already.");
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer!");
  }

  public void skipDays(int numberOfdays) {
    this.skippedDays += numberOfdays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name,age,gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
  }
}
