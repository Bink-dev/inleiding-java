package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht1 extends Applet {
    // Initialiseren Textfield(s)
    TextField tekstvak;

    // Initialiseren UserInput(s)
    String userInput;

    // Initialiseren Label(s)
    Label label;

    // Initialiseren Input(s)
    int input;

    // Initialiseren Button(s)
    Button okKnop;

    public void init() {
        label = new Label("Voer een getal in tussen 1 en 10!");
        tekstvak = new TextField("");
        tekstvak.addActionListener(new TekstVakListener());
        okKnop = new Button("Ok");
        okKnop.addActionListener(new TekstVakListener());
        add(label);
        add(tekstvak);
        add(okKnop);

    }

    public void paint(Graphics g) {
        int yCoordinaat = 40;
        int gegevenGetal = input;
        int count = 10;
        int teller = 1;

        while (teller <= count && teller >=0) {
            yCoordinaat += 20;
            g.drawString(teller + " * " + gegevenGetal + " = " + teller * gegevenGetal, 50, yCoordinaat);
            teller++;
        }
    }

    class TekstVakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            userInput = tekstvak.getText();
            input = Integer.parseInt(userInput);
            repaint();

        }
    }
}
