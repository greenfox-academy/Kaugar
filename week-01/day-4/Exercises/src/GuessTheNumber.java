import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Guess the number betweem 0 and 100");

        int findout = random.nextInt(100) + 1;

        while (true) {
            int userInput1 = scanner.nextInt();
            if (userInput1 > findout) {
                System.out.println("The stored number is lower");
            } else if (userInput1 < findout) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("You found the number: ");
                System.out.println(findout);
            }
        }
    }
}
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8