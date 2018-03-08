public class Fibonacci {

  public static int fibonaccinumber(int number){
    {
      if (number <= 1)
        return number;
      return fibonaccinumber(number-1) + fibonaccinumber(number-2);
    }
  }

  public static void main(String[] args) {

    System.out.println(fibonaccinumber(7));
  }
}
