
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursionGraphic {
  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0, WIDTH, HEIGHT);
    int size = WIDTH/3;
    drawRecusrion(4,size,size,size,graphics);
  }
  public static void drawRecusrion (int n, int x, int y, int size, Graphics graphics){
    if (n < 0) {
    }else{
      graphics.setColor(Color.cyan);
      graphics.drawRect(x,y-size,size, size);
      graphics.setColor(Color.MAGENTA);
      graphics.drawRect(x,y+size,size, size);
      graphics.setColor(Color.ORANGE);
      graphics.drawRect(x+size,y,size, size);
      graphics.setColor(Color.RED);
      graphics.drawRect(x-size,y,size, size);
      drawRecusrion(n-1,x+size/3,y+size+size/3,size/3,graphics);
      drawRecusrion(n-1,x+size/3,y-size+size/3,size/3,graphics);
      drawRecusrion(n-1,x-size+size/3,y+size/3,size/3,graphics);
      drawRecusrion(n-1,x+size+size/3,y+size/3,size/3,graphics);
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

