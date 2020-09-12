package h04;

import java.applet.Applet;
import java.awt.*;

public class Vlag extends Applet {

    public void init() {setSize(450,400);}

    public void paint(Graphics g) {
        g.drawLine(49,50,50,500);
        g.drawLine(50,50,50,450);
        g.drawRect(50,50,275,225);
        g.drawRect(50,50,275,75);
        g.drawRect(50,125,275,75);

    }
}
