public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the String (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String first = quote.substring(0, 20);
        String second = quote.substring(21, quote.length());
        quote = first + " always takes longer than" +second;


        System.out.println(first);
        System.out.println(second);
        System.out.println(quote);

    }
}
