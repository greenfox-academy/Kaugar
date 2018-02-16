import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your 1st number");
        double userInput1 = scanner.nextInt();

        System.out.println("Write your 2nd number");
        double userInput2 = scanner.nextInt();

        System.out.println("Write your 3rd number");
        double userInput3 = scanner.nextInt();

        System.out.println("Write your 4th number");
        double userInput4 = scanner.nextInt();

        System.out.println("Write your 5th number");
        double userInput5 = scanner.nextInt();

        double sum = (userInput1+userInput2+userInput3+userInput4+userInput5);
        double average = (userInput1+userInput2+userInput3+userInput4+userInput5)/5;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
