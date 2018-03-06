package GreenFoxOrganization;

public class Sponsor extends Person {

  String company;
  int hiredStudents;

  public void introduce (){
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender
            + " who represents " + company + " and hired " + hiredStudents);
  }
  public void getGoal (){
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire(){
    this.hiredStudents++;
  }

  public Sponsor (String name, int age, String gender, String company){
    super(name, age, gender);
    this.company = company;
  }
  public Sponsor (){
    super();
    company = "Google";
    hiredStudents = 0;
  }
}
