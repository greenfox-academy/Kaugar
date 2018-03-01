package Sharpie;

import Sharpie.Sharpie;

import java.util.List;

public class SharpieSet {

  public static int countUsable (List<Sharpie> sharpies){
    int counter = 0;
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).getAmount() > 0){
        counter++;
      }
    }
    return counter;
  }
}