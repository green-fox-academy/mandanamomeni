import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.

    int x = 10;
    int y = 10;
    stepPerp(x, y, graphics);
  }

  public static void stepPer(int x, int y, Graphics graphics) {

    for (int i = 0; i < 3; i++) {
      graphics.setColor(Color.MAGENTA);
      graphics.fillRect(x, y, 50, 50);
      x += 50;
      y += 50;
    }
  }

  public static void stepPerp(int x, int y, Graphics graphics) {

    for (int i = 0; i < 20; i++) {
      graphics.setColor(Color.MAGENTA);
      graphics.fillRect(x, y, 10, 10);
      x += 10;
      y += 10;
    }
  }

  //    Don't touch the code below
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