package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {

    public void init() {setSize(600,1000);}

    public void paint(Graphics g) {
        g.fillRoundRect(150,75,300,600,60,60);
        g.fillRect(250,675,100,400);
        g.setColor(Color.RED);
        g.fillArc(225,125,150,150,1,360);
        g.setColor(Color.ORANGE);
        g.fillArc(225,295,150,150,1,360);
        g.setColor(Color.GREEN);
        g.fillArc(225,465,150,150,1,360);
    }
}
