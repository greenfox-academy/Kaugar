import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise10 {

  private static class Fox {
    String name;
    String type;
    String color;

    public Fox(String name, String type, String color) {
      this.name = name;
      this.type = type;
      this.color = color;
    }

    public String getColor() {
      return color;
    }

    public String getType() {
      return type;
    }

    public String getName() {
      return name;
    }
  }

  public static void main(String[] args) {

    //Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
    //it's up to you how you name/create them! Write a Stream Expression to find the foxes with green color!
    //Write a Stream Expression to find the foxes with green color and pallida type!
    Fox fox1 = new Fox("Bill", "tiny", "blue");
    Fox fox2 = new Fox("Bob", "big", "yellow");
    Fox fox3 = new Fox("Laura", "pallida", "green");
    Fox fox4 = new Fox("Jill", "pallida", "orange");
    Fox fox5 = new Fox("Ken", "hungarian", "pink");

    ArrayList<Fox> foxlist = new ArrayList<>();

    foxlist.add(fox1);
    foxlist.add(fox2);
    foxlist.add(fox3);
    foxlist.add(fox4);
    foxlist.add(fox5);

    System.out.println(foxlist.stream()
            .filter((Fox f) -> f.getColor().equals("green")));

  }
}
