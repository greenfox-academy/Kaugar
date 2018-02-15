public class SacondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int elapsedSeconds = currentSeconds + currentMinutes * 60 + currentHours * 60;
        int remainingSeconds = 24 * 60 * 60 - elapsedSeconds;
        System.out.println(remainingSeconds + " s");
    }
}
