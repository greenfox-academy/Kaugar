
import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochSnowflake {

  static int iterator = 0;

  public static void mainDraw(Graphics graphics){
    int n = 0+iterator;
    int x1 = 50, y1 = 320;
    int x2 = 200, y2 =10;
    int x3 = 350, y3 = 320;
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0,520,520);
    graphics.setColor(getRandomColor());
    drawSnowflake(n,x1,y1,x3,y3, graphics);
    graphics.setColor(getRandomColor());
    drawSnowflake(n,x2,y2,x1,y1, graphics);
    graphics.setColor(getRandomColor());
    drawSnowflake(n,x3,y3,x2,y2, graphics);

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

      y3 = ((x5-x1)/2)*Math.sin(Math.toRadians(30))+ (y1+y5)/2;
      x3 = ((y1-y5)/2)*Math.sin(Math.toRadians(30))+ (x1+x5)/2;

      x4 = x1 + deltaX*2/3;
      y4 = y1 + deltaY*2/3;

      drawSnowflake(n-1,x1,y1,x2,y2,graphics);
      drawSnowflake(n-1,x2,y2,x3,y3,graphics);
      drawSnowflake(n-1,x3,y3,x4,y4,graphics);
      drawSnowflake(n-1,x4,y4,x5,y5,graphics);

    }
  }
  private static Color getRandomColor() {
    Random random = new Random();
    int r = random.nextInt(256);
    int g = random.nextInt(256);
    int b = random.nextInt(256);
    return new Color(r,g,b);
  }

  // Don't touch the code below
  static int WIDTH = 486;
  static int HEIGHT = 486;

  public static void main(String[] args) throws InterruptedException {
    JFrame jFrame = new JFrame("KochSnowflake");
    ImagePanel imagePanel = new ImagePanel();
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(imagePanel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);

    while(true) {
      imagePanel.repaint();
      Thread.sleep(800);
      if (iterator < 5){
        iterator ++;
      }
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



