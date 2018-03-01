public class Power {
  public static void main(String[] args) {

    System.out.println(recursivePower(3,3));

  }
  public static int recursivePower (int n, int base){
    if (base == 0){
      return 1;
    }else {
      return n * recursivePower(n,base-1);
    }
  }
}
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).