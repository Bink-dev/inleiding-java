package h06;

import java.applet.Applet;
import java.awt.*;

public class PositiveToNegative extends Applet {
    // positieve ints
    int a,b,uitkomst;


    public void init() {
        a = 2147483647;
        b = 2147483647;
        uitkomst = a + b;

    }

    public void paint(Graphics g) {
        g.drawString("2147483648 + 2147483648 =" + uitkomst,50,50);}
}
