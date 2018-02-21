import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int squaresize = 320;
        for (int i = 0; i < 20; i++) {
            int R = (int )(Math.random() * 255 + 1);
            int G = (int )(Math.random() * 255 + 1);
            int B = (int )(Math.random() * 255 + 1);
            squaresize -= i*10;
            rainbowRectangle(graphics,squaresize,R,G,B);
        }



    }
    public static void rainbowRectangle (Graphics graphics, int squaresize, int R, int G, int B){
        graphics.setColor(new Color(R,G,B));
        graphics.fillRect(WIDTH/2-squaresize/2,HEIGHT/2-squaresize/2,squaresize,squaresize);

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
