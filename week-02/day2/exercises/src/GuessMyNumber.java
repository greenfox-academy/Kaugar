import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = GetDifficulty();

        System.out.println("Set the level of difficulty(easy, normal, hard, EagleEye):");
        String input = scanner.nextLine();
        System.out.println("Set the range (e.g 100)");
        Integer inputRange = scanner.nextInt();

        System.out.println("You have " + map.get(input) + " lives");
        System.out.println("Guess the number between 0 and "+ inputRange);

        Random random = new Random();
        int findout = random.nextInt(inputRange) + 1;
        int lives = map.get(input);

        Guess(scanner, findout, lives);
    }

    private static void Guess(Scanner scanner, int findout, int lives) {
        while (lives > 0) {
            int userInput1 = scanner.nextInt();
            if (userInput1 > findout) {
                System.out.println("The stored number is lower. You have " + (lives-1) + " lives");
            } else if (userInput1 < findout) {
                System.out.println("The stored number is higher. You have " + (lives-1) + " lives");
            } else {
                System.out.println("You have found the number: ");
                System.out.println(findout);
            }
            lives--;
        }
        System.out.println("You Are DEAD!!!!");
    }

    private static Map<String, Integer> GetDifficulty() {
        Map<String, Integer> map = new HashMap<>();

        map.put("easy", 10);
        map.put("normal", 5);
        map.put("hard", 3);
        map.put("EagleEye", 1);
        return map;
    }
}
