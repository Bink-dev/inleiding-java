package h11;

import java.applet.Applet;
import java.awt.*;

public class VierkantSeries extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller = 0;
        int xCoordinaat = 0;
        int yCoordinaat = 0;

        while (teller < 5){
            xCoordinaat +=25;
            yCoordinaat +=25;
            g.drawRect(xCoordinaat,yCoordinaat,25,25);
            teller++;
        }
    }
}
