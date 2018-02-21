import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int cordx = 0;
        int cordy = 0;

        for (int xcord = 0; xcord <= WIDTH; xcord +=20) {
            drawingLine(graphics,cordx,cordy);
            cordx +=20;
        }
        for (int ycord = 0; ycord <= HEIGHT; ycord +=20) {
            drawingLine(graphics,cordx,cordy);
            cordy +=20;
        }
        for (int x2cord = WIDTH; x2cord >= 0; x2cord -=20) {
            drawingLine(graphics,cordx,cordy);
            cordx -=20;
        }
        for (int y2cord = HEIGHT; y2cord >= 0; y2cord -=20) {
            drawingLine(graphics,cordx,cordy);
            cordy -=20;
        }



    }
    public static void drawingLine (Graphics graphics, int x, int y){
        graphics.drawLine(x,y, WIDTH/2,HEIGHT/2);
        
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
