public class NumberAdder {
  public static void main(String[] args) {

    System.out.println(adderWithRecursion(10));

  }
  public static int adderWithRecursion(int n){
    if (n == 1) {
      return 1;
    }else{
      System.out.println(n);
      return n + adderWithRecursion(n-1);
    }
  }

}
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.