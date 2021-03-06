import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountMultipleLines {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Add a filename");
    String filename = scanner.nextLine();
    System.out.println("Add a word");
    String word = scanner.nextLine();
    System.out.println("Add the number of the lines");
    int lines = scanner.nextInt();

    creator(filename, word, lines);
  }

  private static void creator(String filename, String word, int lines) {
    List content = new ArrayList();
    for (int i = 0; i < lines; i++) {
      content.add(word);
    }
    try {
      Path filPath = Paths.get(filename);
      Files.write(filPath,content);
    } catch (Exception e){
      System.out.println("Can't create the file");
    }
  }
}
// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.