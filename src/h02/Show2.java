package h02;

import java.applet.Applet;
import java.awt.*;

public class Show2 extends Applet {

    public void init() {setBackground(Color.white); }

    public void paint(Graphics g) {
        g.drawString("Opdracht 2.2",150,140);
        g.setColor(Color.BLUE);
        g.drawString("Bink",150,160);
        g.setColor(Color.RED);
        g.drawString("Bavelaar",150,180);
    }

}
