package h11;

import java.applet.Applet;
import java.awt.*;

public class VerticaleLijnen extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller = 0;
        int xCoordinaat = 0;

        while (teller  <= 10 ){
        xCoordinaat += 30;
        g.drawLine(xCoordinaat,20,xCoordinaat,270);
        g.drawString("" + teller,xCoordinaat,285);
        teller++;}

    }
}
