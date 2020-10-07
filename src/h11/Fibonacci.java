package h11;

import java.applet.Applet;
import java.awt.*;

public class Fibonacci extends Applet {
    int nummer1,nummer2,nummer3,i,count;

    public void init() {
        count = 20;
        nummer1 = 1;
        nummer2 = 1;
        System.out.println(nummer1);
        System.out.println(nummer2);

    }

    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.drawString("Check het intelliJ Terminal voor de system outprint!",60,140);
        g.drawString("De Fibonacci series word 20 * uitgevoerd",85,160);

        for (i = 2; i < count; i++){
            nummer3 = nummer1 + nummer2;
            System.out.println("" + nummer3);
            nummer1 = nummer2;
            nummer2 = nummer3;
        }
    }
}
