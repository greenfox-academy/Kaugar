import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CopyFile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Add a filename to copy");
    String filename = scanner.nextLine();
    System.out.println("Add the name of the new file");
    String newfile = scanner.nextLine();

    System.out.println(copier(filename, newfile));
  }

  private static boolean copier(String filename, String newfile) {
    Path path1 = Paths.get(filename);
    Path path2 = Paths.get(newfile);
    try {
      Files.copy(path1,path2);
      return true;
    } catch (IOException e){
      return false;
    }
  }
}
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful