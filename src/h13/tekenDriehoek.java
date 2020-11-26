package h13;

import java.applet.Applet;
import java.awt.*;

public class tekenDriehoek extends Applet {

    public void init() {
        setSize(400, 350);
    }

    public void paint(Graphics g) {
        int x1 = 165;
        int y1 = 175;
        int x2 = 200;
        int y2 = 95;
        int x3 = 235;
        int y3 = 175;
        this.tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
    }

    private void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawPolygon(new int[]{x1, x2, x3}, new int[]{y1, y2, y3}, 3);
    }
}
