import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int y = 0;
        int x = 0;
        int size = 30;
        for (int col = 0; col < 10; col++) {
            for (int row = 0; row < 10; row++) {
                if (row%2 == 0 && col%2 == 0){
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(x,y, size,size);
                    x += size;
                }else if(row%2 != 0 && col%2==0){
                    graphics.setColor(Color.RED);
                    graphics.fillRect(x,y,size,size);
                    x += size;
                }
                else if (row%2 == 0 && col%2 !=0){
                    graphics.setColor(Color.RED);
                    graphics.fillRect(x,y, size,size);
                    x += size;
                }else if (row%2 != 0 && col%2 !=0){
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(x,y,size,size);
                    x += size;
                }
            }
            y += size;
            x = 0;

            }
        }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
