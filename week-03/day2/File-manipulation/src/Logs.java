import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {


  }
  public static void unique (List<String> adresses){
    String uniquestring = "";
    try {
      Path path1 = Paths.get("log.txt");
      List<String> lines = Files.readAllLines(path1);
      for (int i = 0; i < lines.size() ; i++) {
        lines.add(uniquestring);
      }

    } catch (IOException e){
      System.out.println("Cant Read");
    }
    System.out.println(uniquestring);

  }
}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.