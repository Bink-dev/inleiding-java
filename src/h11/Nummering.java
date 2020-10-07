package h11;

import java.applet.Applet;
import java.awt.*;

public class Nummering extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller = 10;
        int xCoordinaat = 0;

        while (teller >= 10 && teller <=20){
            xCoordinaat += 20;
            g.drawString("" + teller,xCoordinaat ,20);
            teller++;
        }

    }

}
