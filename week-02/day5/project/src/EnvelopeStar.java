import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int div = 10;

        EnvelopeDrawer(graphics, div);



    }

    private static void EnvelopeDrawer(Graphics graphics, int div) {
        graphics.setColor(Color.magenta);
        for (int i = 0; i < 170; i += div) {
            graphics.drawLine(i,WIDTH/2, WIDTH/2,HEIGHT/2+i);
            graphics.drawLine(i,WIDTH/2, HEIGHT/2,HEIGHT/2-i);
            graphics.drawLine(WIDTH-i,WIDTH/2, HEIGHT/2,HEIGHT/2-i);
            graphics.drawLine(WIDTH-i,WIDTH/2, WIDTH/2,HEIGHT/2+i);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
