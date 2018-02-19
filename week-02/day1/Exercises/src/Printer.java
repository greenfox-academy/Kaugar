public class Printer {
    public static void main(String[] args) {
        String first = "Hello", second = "my", third = "friend", fourth = "!";
        System.out.println(printer(first, second, third, fourth));
    }
    public static String printer (String print1, String print2, String print3, String print4){
        String printall = print1 + print2 + print3 + print4;
        return printall;
    }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...