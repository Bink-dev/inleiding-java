package h11;

import java.applet.Applet;
import java.awt.*;

public class CirkelSeries1 extends Applet {

    public void init() {
        setSize(325,300);

    }

    public void paint(Graphics g) {
        int teller = 0;
        int cirkelBreedte = 10;
        int cirkelHoogte = 10;
        int xCoordinaat = 150;
        int yCoordinaat = 150;

        while (teller < 5){
            g.drawOval(xCoordinaat,yCoordinaat,cirkelBreedte,cirkelHoogte);
            xCoordinaat -= 5;
            yCoordinaat -= 5;
            cirkelBreedte += 10;
            cirkelHoogte += 10;
            teller++;
        }

    }
}
