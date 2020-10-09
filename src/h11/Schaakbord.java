package h11;

import java.applet.Applet;
import java.awt.*;

public class Schaakbord extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;

        y = getY(g, x, y);

        x = 50;
        y += 30;

        getY(g, x, y);
        g.drawRect(50,50,240,240);
    }

    private int getY(Graphics g, int x, int y) {
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
            } else {
                g.setColor(Color.white);

            }
            g.fillRect(x,y, 30, 30);
            x += 30;
        }

        x = 50;
        y += 30;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
            } else {
                g.setColor(Color.black);

            }
            g.fillRect(x,y,30,30);
            x += 30;
        }

        x = 50;
        y += 30;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
            } else {
                g.setColor(Color.white);

            }
            g.fillRect(x,y, 30, 30);
            x += 30;
        }

        x = 50;
        y += 30;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
            } else {
                g.setColor(Color.black);

            }
            g.fillRect(x, y, 30, 30);
            x += 30;
        }
        return y;
    }
}

