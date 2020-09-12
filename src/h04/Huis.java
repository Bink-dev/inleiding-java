package h04;

import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {

    public void init() {setSize(450,400);}

    public void paint(Graphics g) {
        g.drawRect(175, 175, 120, 100);
        g.drawRect(180,215,35,60);
        g.drawRect(235,215,50,30);
        g.drawPolygon(new int[] {175,235,295}, new int[] {175,125,175},3);
    }
}
