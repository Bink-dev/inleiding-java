package h04;

import java.applet.Applet;
import java.awt.*;

public class FillArc extends Applet {

    public void init() {setBackground(Color.BLUE);}

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(50,50,200,220,90,360);}
}
