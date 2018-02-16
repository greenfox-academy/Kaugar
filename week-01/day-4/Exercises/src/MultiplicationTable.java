import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give me a whole number:");
            int userInput1 = scanner.nextInt();
            for (int i = 1; i < 11; i++) {
                System.out.println(i + " * " + userInput1 + " = " + i*userInput1 );
            }
        }
    }
    // Create a program that asks for a number and prints the multiplication table with that number
}
