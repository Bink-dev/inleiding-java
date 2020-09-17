package h06;

import java.applet.Applet;
import java.awt.*;

public class Tijd extends Applet {
    int seconden,minuten,uren,dagen,jaren;


    public void init() {
        seconden = 1;
        minuten = 60;
        uren = 3600;
        dagen = 86400;
        jaren = 31536000;

    }

    public void paint(Graphics g) {
        g.drawString(minuten + " * 60 = " + uren,50,30);
        g.drawString("in een uur zitten " + uren +" seconden",50,50);

        g.drawString(uren + " * 24 = " + dagen,50,70);
        g.drawString("In een dag zitten " + dagen +" seconden",50,90 );

        g.drawString(dagen + " * 365 = " + jaren,50,110);
        g.drawString("in een jaar zitten " + jaren +" seconden", 50,130);
    }
}
