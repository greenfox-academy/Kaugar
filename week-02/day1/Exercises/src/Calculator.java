import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expressions E.g: + 5 62");
        String input = scanner.nextLine();


        String[] numbers = input.split(" ");
        int number1 = Integer.valueOf(numbers[1]);
        int number2 = Integer.valueOf(numbers[2]);

        calculator(number1,number2,numbers)
    }
    public static int calculator (int number1, int number2, String numbers[]) {


        if (String.valueOf(numbers[0]).equals("+")) {
            int sum = number1 + number2;
            System.out.println("Result: " + sum);
        } else if (numbers[0].equals("-")) {
            int neg = number1 - number2;
            System.out.println("Result: " + neg);
        } else if (numbers[0].equals("*")) {
            int multip = number1 * number2;
            System.out.println("Result: " + multip);
        } else if (numbers[0].equals("/")) {
            int div = number1 / number2;
            System.out.println("Result: " + div);
        } else if (numbers[0].equals("%")) {
            int div2 = number1 % number2;
            System.out.println("Result: " + div2);
        }
    }




    }
}
