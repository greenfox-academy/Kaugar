import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        int part = 4;
        Colors(graphics);
        CanvasSplitter(graphics, part);
        LineDrawer(graphics, part);



    }
    private static void Colors(Graphics graphics) {
        int R = (int)(Math.random( )*256);
        int G = (int)(Math.random( )*256);
        int B = (int)(Math.random( )*256);
        Color randomColor = new Color(R, G, B);
        graphics.setColor(randomColor);
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
                for (int j = 0; j < WIDTH/part; j += 20/part) {
                    graphics.drawLine(0 +j+i,0+y, WIDTH/part+i,20/part+j+y);
            }
                for (int k = 0; k < HEIGHT/part; k += 20/part) {
                    graphics.drawLine(0+i,20/part+k+y, 20/part+k+i,HEIGHT/part+y);
            }
        }

        }
    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Drawing");
        ImagePanel imagePanel = new ImagePanel();
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(imagePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        while(true) {
            imagePanel.repaint();
            Thread.sleep(1000);
        }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
