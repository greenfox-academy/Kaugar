package Sharpie;

import Sharpie.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class MainSharpie {
  public static void main(String[] args) {
    List<Sharpie> sharpies = new ArrayList<>();
    Sharpie first = new Sharpie("blue", 3);
    Sharpie second = new Sharpie("pink",5);
    Sharpie third = new Sharpie("red",2);
    Sharpie fourth = new Sharpie("grey",5);

    first.useAll();
    third.useAll();

    sharpies.add(first);
    sharpies.add(second);
    sharpies.add(third);
    sharpies.add(fourth);

    System.out.println(Sharpie.SharpieSet.countUsable(sharpies));

  }

}
