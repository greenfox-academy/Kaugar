import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Divided();

  }

  private static void Divided() {
    Scanner scanner = new Scanner(System.in);
    int divisor = scanner.nextInt();
    try {
      int result = 12 / divisor;
      System.out.println(result);

    }
    catch (ArithmeticException e) {
      System.out.println("fails");
    }
  }
}
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0