package h04;

import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {

    public void init() {setSize(240,200);}

    public void paint(Graphics g) {
        int xPoints[] = {110,180,40,110};
        int yPoints[] = {30,100,100,30};

        g.setColor(Color.CYAN);
        g.fillPolygon(xPoints, yPoints, 4);}
}
