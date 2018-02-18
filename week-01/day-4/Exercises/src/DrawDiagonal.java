import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int userInput1 = scanner.nextInt();

        for (int i = 0; i < userInput1; i++) {
            if (i == 0 || i == userInput1-1) {
                for (int j = 0; j < userInput1; j++)
                    System.out.print("%");
            } else {
                System.out.print("%");
                for (int k = 0; k < i-1; k++) {
                        System.out.print(" ");
                    }
                System.out.print("%");
                for (int l = userInput1-2-i; l > 0; l--) {
                    System.out.print(" ");
                }
                System.out.print("%");
            }
            System.out.println("");
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was