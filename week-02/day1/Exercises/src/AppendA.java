public class AppendA {
    public static void main(String[] args) {
        String[] nimals = {"kuty", "macsk", "cic"};
        for (int j = 0; j < nimals.length; j++) {
            nimals[j] = nimals[j] + "a";

        }
        for (int i = 0; i < nimals.length ; i++) {
            System.out.println(nimals[i]);
        }

    }

}
// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end