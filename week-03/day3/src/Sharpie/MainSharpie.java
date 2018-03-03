package Sharpie;

import Sharpie.Sharpie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainSharpie {
  public static void main(String[] args) {

    List<Sharpie> sharpies = new ArrayList<>();

    Sharpie first = new Sharpie("blue", 3);
    Sharpie second = new Sharpie("pink",5);
    Sharpie third = new Sharpie("red",2);
    Sharpie fourth = new Sharpie("grey",5);

    sharpies.add(first);
    sharpies.add(second);
    sharpies.add(third);
    sharpies.add(fourth);

    for (int i = 0; i < 100; i++) {
      first.use();
    }



    System.out.println(SharpieSet.countUsable(sharpies));

    System.out.println(SharpieSet.removeTrash(sharpies));

  }

}
