import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int userInput1 = scanner.nextInt();

        for (int i = 1; i < userInput1; i = i+2) {
            for (int j = 0; j < userInput1-i/2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i ; k++) {
                System.out.print("*");

            }
            System.out.println("");

        }
        for (int i = userInput1; i >=0 ; i -=2) {
            for (int j = 0; j < userInput1-i/2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i ; k++) {
                System.out.print("*");

            }
            System.out.println("");
            }

        }

    }

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was