package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndexTabel extends Applet {
    boolean gevonden;

    Button okKnop;

    TextField tekstvak;

    Double[] getallen = {3.8,4.6,4.8,6.7,8.3,6.4,7.9,8.6,9.1,9.4};

    double gezocht;

    public void init() {
        tekstvak = new TextField("Voer een getal in");
        tekstvak.addActionListener(new OkKnopListener());
        okKnop = new Button("Ok");
        add(tekstvak);
        add(okKnop);

        gezocht = Double.parseDouble(tekstvak.getText());
        gevonden = false;
        int teller = 0;
        while (teller < getallen.length) {
            if (getallen[teller] == gezocht) {
                gevonden = true;
            }
            teller++;
        }

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getallen.length; teller++){
            g.drawString("" + getallen[teller],50,20 * teller + 20);
        }

        if (gevonden == true) {

        }

    }

    class OkKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            gezocht = Double.parseDouble(tekstvak.getText());

        }
    }
}
