
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalTriangle {
  public static void mainDraw(Graphics graphics){

    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0,520,520);
    drawTriangles(6, WIDTH/2+20, HEIGHT+20, 486, graphics);


  }
  public static void drawTriangles (int n, int x, int y, int size, Graphics graphics){
    if (n < 0) {
    }else{
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(x,y,x+size/2,y-size);
      graphics.setColor(Color.cyan);
      graphics.drawLine(x,y,x-size/2,y-size);
      graphics.setColor(Color.GREEN);
      graphics.drawLine(x+size/2,y-size,x-size/2,y-size);

      drawTriangles(n-1,x,y,size/2,graphics);
      drawTriangles(n-1,x-size/4,y-size/2,size/2,graphics);
      drawTriangles(n-1,x+size/4,y-size/2,size/2,graphics);


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


