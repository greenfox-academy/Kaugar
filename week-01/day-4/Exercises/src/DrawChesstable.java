public class DrawChesstable {
    public static void main(String[] args) {
        int lines = 8;
        for (int i = 0; i < lines; i++) {
            if (i %2==0){
                System.out.println("% % % %");
            }
            else {
                System.out.println(" % % % %");
            }
        }
    }
}

// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
