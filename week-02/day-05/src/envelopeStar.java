import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class envelopeStar {

  public static void mainDraw(Graphics graphics) {

    int x1 = 0;
    int y1 = 200;
    int x2 = 200;
    int y2 = 200;
    for (int i = 0; i < 11; i++) {

      graphics.setColor(Color.RED);
      graphics.drawLine(x1, y1, x2, y2);
      x1 += 20;
      y2 -= 20;
    }
  }
//    int x12 = 0;
//    int y12 = 200;
//    int x22 = 200;
//    int y22 = 200;
//    for(int i = 0; i<11; i++) {
//
//      graphics.setColor(Color.RED);
//      graphics.drawLine (x12 , y12, x22, y22);
//      x22 +=20  ;
//      y12 -=20 ;
//    }
//  }

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