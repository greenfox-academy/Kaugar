
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochSnowflake {
  public static void mainDraw(Graphics graphics){
    int n = 3;
    int x1 = 20, y1 = 350;
    int x2 = 200, y2 =20;
    int x3 = 380, y3 = 350;

    drawSnowflake(n,x1,y1,x3,y3, graphics);
    //drawSnowflake(n,x2,y2,x1,y1, graphics);
    //drawSnowflake(n,x3,y3,x2,y2, graphics);

  }
  public static void drawSnowflake (int n, double x1, double y1,double x5, double y5, Graphics graphics){
    double deltaX, deltaY, x2, y2, x3, y3, x4, y4;

    if (n == 1) {
      graphics.drawLine((int)x1,(int)y1, (int)x5, (int)y5);
    }else{
      deltaX = x5-x1;
      deltaY = y5-y1;

      x2 = x1 + deltaX/3;
      y2 = y1 + deltaY/3;

      x3 = ((x1 + x5) / 2 + (Math.sqrt(3.0) / 6) * (y1 - y5));
      y3 = ((y1 + y5) / 2 + (Math.sqrt(3.0) / 6) * (x5 - x1));

      x4 = x1 + deltaX*2/3;
      y4 = y1 + deltaY*2/3;

      drawSnowflake(n-1,x1,y1,x2,y2,graphics);
      drawSnowflake(n-1,x2,y2,x3,y3,graphics);
      drawSnowflake(n-1,x3,y3,x4,y4,graphics);
      drawSnowflake(n-1,x4,y4,x5,y5,graphics);


    }
  }

  // Don't touch the code below
  static int WIDTH = 486;
  static int HEIGHT = 486;

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



