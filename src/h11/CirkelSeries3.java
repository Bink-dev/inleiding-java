package h11;

import java.applet.Applet;
import java.awt.*;

public class CirkelSeries3 extends Applet {

    public void init() {
        setSize(600,600);

    }

    public void paint(Graphics g) {
        int teller = 0;
        int cirkelBreedte = 5;
        int cirkelHoogte = 5;

        while (teller < 100){
            g.drawOval(20,20,cirkelBreedte,cirkelHoogte);
            cirkelBreedte += 5;
            cirkelHoogte += 5;
            teller++;
        }

    }

}
