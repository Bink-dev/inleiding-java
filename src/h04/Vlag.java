package h04;

import java.applet.Applet;
import java.awt.*;

public class Vlag extends Applet {

    public void init() {setSize(450,400);}

    public void paint(Graphics g) {
        g.drawLine(49,50,50,750);
        g.drawLine(50,50,50,450);
        g.drawRect(50,50,275,225);
        g.drawRect(50,50,276,226);
        g.drawRect(49,125,275,75);
        g.drawRect(51,126,275,76);
        g.drawRect(50,200,275,75);
        g.setColor(Color.BLUE);
        g.fillRect(51,201,274,74);
        g.setColor(Color.red);
        g.fillRect(51,51,274,74);
    }
}
