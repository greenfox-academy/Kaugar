import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        System.out.println(a);
        System.out.println(b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped");
        System.out.println(a);
        System.out.println(b);
    }
}
