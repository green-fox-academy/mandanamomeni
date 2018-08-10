
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  public static void mainDraw(Graphics graphics) {
    int startx = 30;
    int starty = 30;
    int sizeSq= 10;
    draw3D(startx, starty,sizeSq, graphics);
  }

  public static void draw3D(int startx, int starty, int sizeSq, Graphics graphics) {

    for (int i = 0; i < 3; i++) {
      graphics.setColor(Color.MAGENTA);
      graphics.fillRect(startx, starty, sizeSq, sizeSq);

      startx += sizeSq;
      starty += sizeSq;
      sizeSq += sizeSq/2;
    }
  }
  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing ");
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