public class Student {
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  public void setGoal() {
    System.out.println("Be a junior software developer!");
  }

  public void skipDays(int numberOfdays) {
    this.skippedDays += numberOfdays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life"
  }
}
