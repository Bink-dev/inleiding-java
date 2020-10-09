package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht2 extends Applet {
    // Initialiseren Label(s)
    Label label;

    // Initialiseren onzichtbare Button(s)
    Button onzichtbareKnop;

    // Initialiseren waarde(s)
    int waarde;

    public void init() {
        onzichtbareKnop = new Button("");
        onzichtbareKnop.addActionListener(new enterListener());
        waarde = 1;
        label = new Label("De tafel van " + waarde);
        add(label);
        add(onzichtbareKnop);

    }

    public void paint(Graphics g) {
        int yCoordinaat = 30;
        int count = 10;
        int teller = 0;

        while (teller < count && teller >= 0) {
            teller++;
            yCoordinaat += 20;
            g.drawString(teller + " * " + waarde + " = " + teller * waarde,20,yCoordinaat);
        }

        if (waarde >= 10)
            waarde = 0;
    }

    class enterListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            waarde++;
            repaint();

        }
    }
}
