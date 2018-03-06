import java.util.Arrays;

public class Dice {
  //    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6
  int[] dices = new int[6];
  int diceSides = 6;

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * diceSides) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * diceSides) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * diceSides) + 1;
  }

  public static void main(String[] args) {
    int rolls = 6;
    Dice myDice = new Dice();
    myDice.roll();

    for (int i = 0; i < myDice.getCurrent().length; i++) {
      while (myDice.getCurrent(i) != 6) {
        myDice.reroll(i);
      }
    }
    for (int i = 0; i < rolls; i++) {
      System.out.println(myDice.getCurrent(i));
    }
  }
}