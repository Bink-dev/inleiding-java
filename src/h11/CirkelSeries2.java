package h11;

import java.applet.Applet;
import java.awt.*;

public class CirkelSeries2 extends Applet {

    public void init() {
        setSize(600,550);

    }

    public void paint(Graphics g) {
        int teller = 0;
        int cirkelBreedte = 10;
        int cirkelHoogte = 10;
        int xCoordinaat = 300;
        int yCoordinaat = 275;

        while (teller < 50){
            g.drawOval(xCoordinaat,yCoordinaat,cirkelBreedte,cirkelHoogte);
            cirkelBreedte += 10;
            cirkelHoogte += 10;
            xCoordinaat -= 5;
            yCoordinaat -= 5;
            teller++;
        }
    }
}
