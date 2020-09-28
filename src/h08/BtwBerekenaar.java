package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtwBerekenaar extends Applet {
    // Variabelen voor de tekstvak(ken)
    TextField tekstvak;

    // Variabelen voor de som(men)
    double bedrag,bedragINCBTW;
    String userInput;

    // Variabelen voor de button(s)
    Button berekenKnop;

    public void init() {
        setSize(450,250);
        tekstvak = new TextField("Vul hier je bedrag in!");
        tekstvak.addActionListener(new BerekenListener());
        berekenKnop = new Button("Bereken!");
        berekenKnop.addActionListener(new BerekenListener());
        userInput = "";
        add(berekenKnop);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.white);
        g.drawString("Vul je bedrag zonder BTW in en bereken het bedrag inc. BTW,",40,45);
        g.drawString("gebruik een punt ipv komma. deze herkent hij anders niet!",47,65);
        g.drawString("Bedrag Inclusief BTW   " + bedragINCBTW,80,130);
        berekenKnop.setLocation(80,80);
        tekstvak.setLocation(150,81);

    }

    class BerekenListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            // Event handling voor de knop
            userInput = tekstvak.getText();
            bedrag = Double.parseDouble(userInput);
            bedragINCBTW = Math.round (((bedrag / 100.0) * 121.0 * 100.0))/100.0;
            repaint();

        }

    }
}
