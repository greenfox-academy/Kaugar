package Sharpie;

import java.util.List;

public class SharpieSet {

  List<Sharpie> sharpies;

  public static int countUsable(List<Sharpie> sharpies) {
    int counter = 0;
    for (int i = 0; i <sharpies.size() ; i++) {
      if (sharpies.get(i).getInkamount() > 0){
        counter++;
      }
    }
    return counter;
  }
  public static List<Sharpie> removeTrash (List<Sharpie> sharpies){
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).getInkamount() < 1){
        sharpies.remove(i);
      }
    }
    return sharpies;
  }
}