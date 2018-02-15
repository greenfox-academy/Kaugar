import java.util.Scanner;

public class MilesToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Write in the km than press ENTER:");
        Scanner scanner = new Scanner(System.in);

        double userInput1 = scanner.nextInt();
        double inputInMiles = userInput1 * 0.621371;

        System.out.println(inputInMiles + " miles");

    }
}
