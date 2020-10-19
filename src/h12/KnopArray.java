package h12;

import java.applet.Applet;
import java.awt.*;

public class KnopArray extends Applet {

    Button[] buttons = new Button[25];

    public void init() {
        for (int teller = 0; teller != buttons.length; teller++){
            buttons[teller] = new Button("Knop " + (teller + 1));
            add(buttons[teller]);
        }
    }

    public void paint(Graphics g) {

    }
}
