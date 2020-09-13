package h04;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {

    public void init() {setSize(500,500);}

    public void paint(Graphics g) {
        g.drawRoundRect(50,50,400,400,50,50);
        g.fillArc(125,115,100,100,1,360);
        g.fillArc(125,285,100,100,1,360);
        g.fillArc(275,115,100,100,1,360);
        g.fillArc(275,285,100,100,1,360);
    }
}
