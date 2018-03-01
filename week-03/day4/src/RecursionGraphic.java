
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursionGraphic {
  public static void mainDraw(Graphics graphics){
  drawRecusrion(10,40,40,100,graphics);
  graphics.drawRect(0,0, WIDTH, HEIGHT);
  }
  public static void drawRecusrion (int n, int x, int y, int size, Graphics graphics){
    if (n < 0) {
    }else{
      graphics.drawRect(x,y,size, size);
      drawRecusrion(n-1,WIDTH/3,HEIGHT/3,size/3,graphics);
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

