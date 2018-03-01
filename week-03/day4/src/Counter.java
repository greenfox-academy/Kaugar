public class Counter {
  public static void main(String[] args) {

    System.out.println(counterWithRecursion(10));

  }
  public static int counterWithRecursion(int n){
    if (n == 0) {
      return 0;
    }else{
      System.out.println(n);
      return counterWithRecursion(n-1);
    }
  }
}
// Write a recursive function that takes one parameter: n and counts down from n.