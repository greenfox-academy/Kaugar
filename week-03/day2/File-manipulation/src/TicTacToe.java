import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.


    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw

    //System.out.println(ticTacResult(""));


  }

  private static String ticTacResult (String file) {
    String result = "";
    try{
      Path path1 = Paths.get(file);
      List<String> lines = Files.readAllLines(path1);
      if (xwin(lines)){
        result = "X";
      }else if (owin(lines)){
        result = "O";
      }else{
        result = "draw";
      }

    }catch (IOException e){
      System.out.println("No file");
    }

    return result;

  }
  public static boolean xwin (List<String> lines){
    return (lines.get(0).charAt(0) == 'X' && lines.get(0).charAt(1) == 'X' && lines.get(0).charAt(2) == 'X' ||
            lines.get(1).charAt(0) == 'X' && lines.get(1).charAt(1) == 'X' && lines.get(1).charAt(2) == 'X' ||
            lines.get(2).charAt(0) == 'X' && lines.get(2).charAt(1) == 'X' && lines.get(2).charAt(2) == 'X' ||
            lines.get(0).charAt(0) == 'X' && lines.get(1).charAt(0) == 'X' && lines.get(2).charAt(0) == 'X' ||
            lines.get(0).charAt(1) == 'X' && lines.get(1).charAt(1) == 'X' && lines.get(2).charAt(1) == 'X' ||
            lines.get(0).charAt(2) == 'X' && lines.get(1).charAt(2) == 'X' && lines.get(2).charAt(2) == 'X' ||
            lines.get(0).charAt(0) == 'X' && lines.get(1).charAt(1) == 'X' && lines.get(2).charAt(2) == 'X' ||
            lines.get(0).charAt(2) == 'X' && lines.get(1).charAt(1) == 'X' && lines.get(2).charAt(0) == 'X' );
  }
  public static boolean owin (List<String> lines){
    return (lines.get(0).charAt(0)== 'O' && lines.get(0).charAt(1) == 'O' && lines.get(0).charAt(2) == 'O' ||
            lines.get(1).charAt(0)== 'O' && lines.get(1).charAt(1) == 'O' && lines.get(1).charAt(2) == 'O' ||
            lines.get(2).charAt(0)== 'O' && lines.get(2).charAt(1) == 'O' && lines.get(2).charAt(2) == 'O' ||
            lines.get(0).charAt(0)== 'O' && lines.get(1).charAt(0) == 'O' && lines.get(2).charAt(0) == 'O' ||
            lines.get(0).charAt(1)== 'O' && lines.get(1).charAt(1) == 'O' && lines.get(2).charAt(1) == 'O' ||
            lines.get(0).charAt(2)== 'O' && lines.get(1).charAt(2) == 'O' && lines.get(2).charAt(2) == 'O' ||
            lines.get(0).charAt(0)== 'O' && lines.get(1).charAt(1) == 'O' && lines.get(2).charAt(2) == 'O' ||
            lines.get(0).charAt(2)== 'O' && lines.get(1).charAt(1) == 'O' && lines.get(2).charAt(0) == 'O' );
  }
}
