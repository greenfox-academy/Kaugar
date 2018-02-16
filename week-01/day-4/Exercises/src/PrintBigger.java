import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
// Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (x < 20) {
            System.out.println("Give me a number");
            double userInput1 = scanner.nextInt();
            System.out.println("Give me another number");
            double userInput2 = scanner.nextInt();
            if (userInput1 > userInput2) {
                System.out.println((int)userInput1 + " is bigger");
                System.out.println("------------");
            }
            else {
                System.out.println((int)userInput2 + " is bigger");
                System.out.println("------------");
            }
        }
        x++;
    }
}
