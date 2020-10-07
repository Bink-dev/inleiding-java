package h11;

import java.applet.Applet;
import java.awt.*;

public class Tafel3 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int yCoordinaat = 0;
        int gegevenGetal = 3;
        int count = 10;
        int teller = 1;

        while (teller <= count && teller >=0){
            yCoordinaat += 20;
            g.drawString( teller + " * " + gegevenGetal + " = " + teller * gegevenGetal,20 ,yCoordinaat);
            teller++;
        }

    }

}
