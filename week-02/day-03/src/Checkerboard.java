
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {

int startx = 20;
int starty = 20;

check (startx,starty,graphics);
  }
  public static void check (int startx, int starty, Graphics graphics) {

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(startx, starty, 30, 30);
        starty += 60;
      }
      graphics.setColor(Color.BLACK);
      graphics.fillRect(startx, starty, 30, 30);
      starty += 60;
    }
  }
  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

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