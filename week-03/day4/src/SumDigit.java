public class SumDigit {
  public static void main(String[] args) {

    System.out.println(digitSummer(126));

  }
  public static int digitSummer (int n){
    if (n == 1){
      return 1;
    }else{
      return n%10 + digitSummer(n/10);
    }
  }
}
// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).