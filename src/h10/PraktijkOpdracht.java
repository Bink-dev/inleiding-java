package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    // Variabelen voor Textfield(s)
    TextField tekstvak;

    // Variabelen voor UserInput(s)
    String userInput;

    // Variabelen voor Antwoord(en)
    double antwoord;

    // Variabelen voor Output(s)
    String output;

    public void init() {
        // Initialiseren van Textfield(s)
        tekstvak = new TextField("Voer uw cijfer in en druk enter!");
        tekstvak.addActionListener(new TekstVakListener());
        add(tekstvak);

        // Initialiseren UserInput(s)
        userInput = "";

        // Initaliseren van Antwoord(en)
        antwoord = 0.0;

        // Initialiseren van Output(s)
        output = "Je hebt nog geen cijfer ingevoerd!";

    }

    public void paint(Graphics g) {
        // Declareren en initialiseren van Antwoord(en)
        g.drawString(output,80,100);

        // Textfield locatie bepalen
        tekstvak.setLocation(80,50);

        // Declareren en initialiseren van Background color
        setBackground(Color.pink);

    }

    class TekstVakListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            // Userinput waarde bepalen en omzetten naar Double(s)
            userInput = tekstvak.getText();
            antwoord = Double.parseDouble(userInput);

            // If methode voor Antwoord(en)
            if (antwoord > 0.0 && antwoord < 3.99)
                output = "Je hebt een slecht!";

            if (antwoord > 3.99 && antwoord < 4.99)
                output = "Je hebt een onvoldoende!";

            if (antwoord > 4.99 && antwoord < 5.49)
                output = "Je hebt een matig!";

            if (antwoord > 5.49 && antwoord < 7.99)
                output = "je hebt een voldoende!";

            if (antwoord > 7.99 && antwoord < 10)
                output = "Je hebt een goed!";

            if (antwoord > 10.0)
                output = "Waarschuwing! Je hebt een verkeerd cijfer ingevoerd.";

            if (antwoord < 0.0)
                output = "Waarschuwing! Je hebt een verkeerd cijfer ingevoerd.";

            repaint();
            }
    }
}
