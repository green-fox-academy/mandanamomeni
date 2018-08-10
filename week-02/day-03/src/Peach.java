

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    this.setBackground(Color.WHITE);

    g.setColor(Color.BLUE);
    g.fillRect(25, 25, 100, 30);

    g.setColor(new Color(120, 15, 100));
    g.fillRect(25, 65, 100, 30);


    g.setColor(Color.BLUE);
    g.drawLine(150, 25, 150, 300);


    g.setColor(Color.PINK);
    g.drawString("This is a text. ", 25, 120);

    g.setColor(new Color(14, 80, 50));
    g.drawRect(200, 55, 100, 30);

    g.setColor(Color.ORANGE);
    g.drawOval(200, 100, 100, 30);

    g.setColor(Color.YELLOW);
    g.fill3DRect(25, 200, 100, 30, true);


  }
}
