import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        int part = 16;
        CanvasSplitter(graphics, part);
        LineDrawer(graphics, part);


    }

    private static void CanvasSplitter(Graphics graphics, int part) {
        for (int i = 0; i < part; i++) {
            graphics.drawLine(WIDTH/part+(i*WIDTH/part),0, WIDTH/part+(i*WIDTH/part), HEIGHT);
            graphics.drawLine(0,HEIGHT/part+(i*HEIGHT/part), WIDTH, HEIGHT/part+(i*HEIGHT/part));
        }
    }

    private static void LineDrawer(Graphics graphics, int part) {
        for (int y = 0; y < HEIGHT; y += HEIGHT/part) {
            for (int i = 0; i < WIDTH; i +=WIDTH/part) {
                graphics.setColor(Color.magenta);
                for (int j = 0; j < WIDTH/part; j += 20/part) {
                    graphics.drawLine(0 +j+i,0+y, WIDTH/part+i,20/part+j+y);
            }
                graphics.setColor(Color.green);
                for (int k = 0; k < HEIGHT/part; k += 20/part) {
                    graphics.drawLine(0+i,20/part+k+y, 20/part+k+i,HEIGHT/part+y);
            }
        }

        }
    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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
