package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Knop extends Applet {

    // Variabelen voor de knoppen
    Button knop;

    //VAriabelen voor de schermtekst
    String schermtekst1;

    public void init() {
        schermtekst1 = "doet deze knop wel iets?";
        knop = new Button("Klik op mij!");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst1,50,60);}

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst1 = "Ja, deze knop doet wel iets";
            repaint();
        }
    }
}
