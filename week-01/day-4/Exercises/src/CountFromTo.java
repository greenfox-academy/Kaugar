import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give me a number");
            int userInput1 = scanner.nextInt();
            System.out.println("Give me another number");
            int userInput2 = scanner.nextInt();
            if (userInput1 >= userInput2) {
                System.out.println("Second number should be bigger");
            } else {
                for (int i = userInput1; i < userInput1 + (userInput2 - userInput1); i++) {
                    System.out.println(i);
                }
            }
        }
    }
}
    // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
