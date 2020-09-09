package h02;

import java.applet.Applet;
import java.awt.*;

public class Show extends Applet {

    public void init() {
setBackground(new Color(0,0,250));
    }

    public void paint(Graphics g)
    { g.setColor(new Color(255,255,0));
    g.drawString("Opdracht 2.1", 50,40);
    g.drawString("Bink Bavelaar",50,60); }
}
