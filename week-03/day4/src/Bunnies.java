public class Bunnies {
  public static void main(String[] args) {
    System.out.println(earsRecursive(10));

  }
  public static int earsRecursive (int n){
    if (n == 1){
      return 2;
    }else {
      return 2 + earsRecursive(n-1);
    }
  }

}
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
