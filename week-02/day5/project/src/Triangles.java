import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        int rowsOfTriangle = 30;
        triangleDrawer(graphics, rowsOfTriangle);


    }

    private static void triangleDrawer(Graphics graphics, int rows) {
        int[] trianglex = {WIDTH / 2, WIDTH / 2 - 10, WIDTH / 2 + 10};
        int[] triangley = {0, 17, 17};

        graphics.drawPolygon(trianglex, triangley, 3);
        for (int row = 1; row < rows; row++) {
            for (int j = 0; j < 3; j++) {
                trianglex[j] = trianglex[j] -10;
            }
            for (int i = 0; i < 3; i++) {
                triangley[i] = triangley[i] + 17;
            }
            graphics.drawPolygon(trianglex, triangley, 3);
            for (int l = 1; l <= row; l++) {
                for (int k = 0; k < 3; k++) {
                    trianglex[k] = trianglex[k] + 20;
                }
                for (int j = 1; j <= row; j++) {
                    graphics.drawPolygon(trianglex, triangley, 3);
                }

            }
            for (int g = 0; g < 3; g++) {
                trianglex[g] = trianglex[g] -20 * row;
           }
        }
    }

    // Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

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
