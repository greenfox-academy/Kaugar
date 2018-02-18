import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number than press [Enter]");
        int userInput1 = scanner.nextInt();
        float sum = 0;
        for (int i = 0; i < userInput1; i++) {
            System.out.println("Type an integer than press [Enter]");
            float userInput2 = scanner.nextInt();
            sum += userInput2;
        }

        System.out.println("Sum: " + (int)sum + ", Average: " + sum/userInput1);
    }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4