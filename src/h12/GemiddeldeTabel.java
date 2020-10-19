package h12;

import java.applet.Applet;
import java.awt.*;

public class GemiddeldeTabel extends Applet {
    Double[] cijfers = {7.9, 8.6, 4.9, 6.9, 6.8, 6.7, 7.3, 7.8, 8.1, 8.5};

    double totaal, gemiddelde;
    int tempGemiddelde;

    public void init() {

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < cijfers.length; teller++){
            g.drawString("" + cijfers[teller],50,25 * teller + 20);
            totaal += cijfers[teller];
        }
        gemiddelde = totaal / 10.0 * 10;
        tempGemiddelde = (int) gemiddelde;
        gemiddelde = tempGemiddelde / 10.0;

        g.drawString("Je gemiddelde is = " + gemiddelde,120,140);

    }
}
