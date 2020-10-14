package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht2 extends Applet {
    // Initialiseren Label(s)
    Label label;

    // Initialiseren onzichtbare Button(s)
    Button okKnop;

    // Initialiseren waarde(s)
    int waarde;

    public void init() {
        okKnop = new Button("Ok ->");
        okKnop.addActionListener(new KnopListener());
        waarde = 1;
        label = new Label("De tafel van " + waarde);
        add(label);
        add(okKnop);

    }

    public void paint(Graphics g) {
        int yCoordinaat = 30;
        int count = 10;
        int teller = 0;

        while (teller < count && teller >= 0) {
            label.setText("De tafel van " + waarde);
            teller++;
            yCoordinaat += 20;
            g.drawString(teller + " * " + waarde + " = " + teller * waarde,20,yCoordinaat);
        }

        if (waarde >= 10)
            waarde = 0;
    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            waarde++;
            //System.out.println(waarde);
            repaint();

        }
    }
}
