package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenAvond extends Applet {

    // Variabelen voor de knoppen
    Button manKnop,vrouwKnop;

    // Variabelen voor de counters
    int counterM, counterV, counterPM, counterPV, counterTotaal;


    public void init() {
        // initialiseren
        manKnop = new Button("Mannen");
        vrouwKnop = new Button("Vrouwen");
        manKnop.addActionListener(new ManKnopListener());
        vrouwKnop.addActionListener(new VrouwKnopListener());
        counterM = 0;
        counterV = 0;
        counterPM = 387;
        counterPV = 324;
        counterTotaal = counterM + counterV;
        add(manKnop);
        add(vrouwKnop);

    }

    public void paint(Graphics g) {

        // counters initialiseren
        g.drawString(String.valueOf(counterM),100,35);
        g.drawString(String.valueOf(counterV),100,65);
        g.drawString(String.valueOf(counterPM),155,100);
        g.drawString(String.valueOf(counterPV),155,130);
        g.drawString(String.valueOf(counterTotaal),75,160);

        // .set methodes
        manKnop.setLabel("Mannen");
        manKnop.setLocation(20,20);
        vrouwKnop.setLabel("Vrouwen");
        vrouwKnop.setLocation(20,50);

        // Counter namen in g.drawstring
        g.drawString("Potentieele Mannen",20,100);
        g.drawString("Potentieele Vrouwen",20,130);
        g.drawString("Totaal",20,160);

        setBackground(Color.orange);

    }

    class ManKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            counterM++;
            System.out.println("knopklik " + counterM);
            counterPV--;
            counterTotaal++;
            repaint();

        }
    }

    class VrouwKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            counterV++;
            System.out.println("knopklik " + counterV);
            counterPM--;
            counterTotaal++;
            repaint();
        }
    }
}
