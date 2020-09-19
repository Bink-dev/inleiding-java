package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tekstvak extends Applet {

    // Variabelen voor tekstvak
    TextField tekstvak;
    Label label;
    String s;
    double getal;

    public void init() {
        tekstvak = new TextField("Klik op mij!",20);
        label = new Label("Type iets in het tekstvak" + "en druk op Enter");
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        add(label);
        s = "";

    }

    public void paint(Graphics g) {
        g.drawString(s,50,70);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
}
