package h06;

import java.applet.Applet;
import java.awt.*;

public class Karwei extends Applet {

    // Variabelen voor de som
    double uitkomst,volledigBedrag,aantal;


    public void init() {setSize(300,200);

    // waardes
    volledigBedrag = 113.0;
    aantal = 4.0;
    uitkomst = volledigBedrag / aantal;


    }

    public void paint(Graphics g) {
        g.drawString("113 : 4 = " + uitkomst ,40,40);
        g.drawString("Jan =" + uitkomst,40,55);
        g.drawString("Ali =" + uitkomst,40,70);
        g.drawString("Jeannette =" + uitkomst,40,85);
        g.drawString("Bink =" + uitkomst,40,100);}
}
