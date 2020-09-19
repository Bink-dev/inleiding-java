package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tekstknop extends Applet {
    Button knop;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst" + " in het tekstvakje" + " en klik op Ok",50,60);
    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Jammer" + " Maar nu staat er iets anders");
            repaint();
        }
    }
}
