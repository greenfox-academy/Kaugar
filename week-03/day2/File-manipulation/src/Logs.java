import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    System.out.println(unique("log.txt"));
    System.out.println(ratio("log.txt"));


  }
  public static ArrayList<String> unique (String adresses){
    ArrayList<String> uniqips = new ArrayList<>();
    try {
      Path path1 = Paths.get(adresses);
      List<String> lines = Files.readAllLines(path1);
      for (int i = 0; i < lines.size(); i++) {
        if(!uniqips.contains(lines.get(i).substring(27,38)))
        uniqips.add(lines.get(i).substring(27,38));
      }
    } catch (IOException e){
      System.out.println("Cant Read");
    }
    return uniqips;
  }
  public static String ratio (String getandpost){
    int gets = 0;
    int posts = 0;
    String answer = "";
    try{
      Path path1 = Paths.get(getandpost);
      List<String> lines = Files.readAllLines(path1);
      for (int i = 0; i < lines.size(); i++) {
        if (lines.get(i).contains("GET")){
          gets++;
        }else {
          posts++;
        }
      }
    } catch (IOException e){
      System.out.println("Cant Read");
    }
    answer = "Ratio(GET / POST) : " + Integer.toString(gets) + " / " + Integer.toString(posts);
    return answer;
  }
}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.