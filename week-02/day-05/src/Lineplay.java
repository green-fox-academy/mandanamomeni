import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Lineplay {

  public static void mainDraw(Graphics graphics) {

    int x = 0;

    for (int i = 0; i < 13; i++) {

      graphics.setColor(Color.GRAY);
      graphics.drawLine(x + 20, 5, 280, 5 + x);
      x += 20;
    }
    int y = 0;
    for (int i = 0; i < 13; i++) {
      y += 20;

      graphics.setColor(Color.PINK);
      graphics.drawLine(5, y + 20, 5 + y, 280);
      x += 20;
    }

  }

  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

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