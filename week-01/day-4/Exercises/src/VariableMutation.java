public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        a += 10;

        System.out.println(a);




        int b = 100;
        // make it smaller by 7
        b = b-7;

        System.out.println(b);




        int c = 44;
        // please double c's value
        c *= 2;

        System.out.println(c);




        int d = 125;
        // please divide by 5 d's value
        d /= 5;

        System.out.println(d);




        int e = 8;
        // please cube of e's value
        e = (int) Math.pow(d, 3);

        System.out.println(e);




        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean compare;
        compare = (f1 > f2);

        System.out.println("Bigger? " + compare);





        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        boolean compare2;
        compare2 = g2*2 > g1;
        System.out.println("Bigger? " + compare2);


        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        int divisor = h % 11;
        boolean divisor2;
        divisor2 = divisor == 0;
        System.out.println("Is 11 a divisor? " + divisor2);




        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int i3 = (int) Math.pow(i2, 3);
        boolean smaller;
        smaller = i1 > i2 && i1 < i3;
        System.out.println("smaller? " + smaller);




        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        int z = j % 3;
        int y = j % 5;
        boolean dividable;
        dividable = z == 0 || y == 0;
        System.out.println("Dividable with 3 or 5: " + dividable);




        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        k = k + k + k + k;


        System.out.println(k);
    }
}
