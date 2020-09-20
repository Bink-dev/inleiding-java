package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OkEnReset extends Applet {
    // Variabelen voor de knoppen
    Button knop1,knop2;

    // Variabelen voor het tekstvak
    TextField tekstvak,tekstvak2;
    String s;

    public void init() {
        knop1 = new Button("Ok");
        knop2 = new Button("Reset");
        tekstvak = new TextField("",50);
        tekstvak2 = new TextField("",50);
        knop1.addActionListener(new KnopListener());
        knop2.addActionListener(new Knoplistener2());
        tekstvak.addActionListener(new KnopListener());
        tekstvak2.addActionListener(new Knoplistener2());
        s = "";
        add(tekstvak);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString(s,15,70);
    }

    class KnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
           s = tekstvak.getText();
           repaint();
        }
    }
    class Knoplistener2 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            tekstvak.setText("");
            repaint();
        }
    }
}
