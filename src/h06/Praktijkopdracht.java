package h06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    // Variabelen voor de som
    int gebroken;
    double c1,c2,c3,aantal,gemiddelde,convert,eindantwoord;


    public void init() {
        c1 = 5.9;
        c2 = 6.3;
        c3 = 6.9;
        aantal = 3;
        gemiddelde = (c1 + c2 + c3) / aantal;
        convert = gemiddelde * 10;
        gebroken = (int) convert;
        eindantwoord = (double) gebroken / 10;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: "+ eindantwoord,100,100);
    }
}
