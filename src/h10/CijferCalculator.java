package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CijferCalculator extends Applet {
    // Variabelen voor Textfield(s)
    TextField tekstVakH1, tekstVakH2,tekstVakH3, tekstVakH4, tekstVakH5;

    // Variabelen voor Antwoord(en)
    double antwoordH1,antwoordH2,antwoordH3,antwoordH4,antwoordH5,antwoordGemiddelde,antwoordGemiddelde2,cijferAantal;

    // Variabelen voor de String(s)
    String tekstAntwoordH1,tekstAntwoordH2,tekstAntwoordH3,tekstAntwoordH4,tekstAntwoordH5,tekstAntwoordGemiddelde;

    public void init() {
        // Grootte van applet declareren en initialiseren
        setSize(550,300);
        // Tekstvakken initialiseren
        tekstVakH1 = new TextField("Voer uw cijfer in voor H1");
        tekstVakH1.addActionListener(new TekstVakListener());
        add(tekstVakH1);
        tekstVakH2 = new TextField("Voer uw cijfer in voor H2");
        tekstVakH2.addActionListener(new TekstVakListener());
        add(tekstVakH2);
        tekstVakH3 = new TextField("Voer uw cijfer in voor H3");
        tekstVakH3.addActionListener(new TekstVakListener());
        add(tekstVakH3);
        tekstVakH4 = new TextField("Voer uw cijfer in voor H4");
        tekstVakH4.addActionListener(new TekstVakListener());
        add(tekstVakH4);
        tekstVakH5 = new TextField("Voer uw cijfer in voor H5");
        tekstVakH5.addActionListener(new TekstVakListener());
        add(tekstVakH5);

        // Tekstantwoorden initialiseren
        tekstAntwoordH1 = "Je hebt nog geen cijfer ingevoerd...";
        tekstAntwoordH2 = "Je hebt nog geen cijfer ingevoerd...";
        tekstAntwoordH3 = "Je hebt nog geen cijfer ingevoerd...";
        tekstAntwoordH4 = "Je hebt nog geen cijfer ingevoerd...";
        tekstAntwoordH5 = "Je hebt nog geen cijfer ingevoerd...";
        tekstAntwoordGemiddelde = "Voer eerst je cijfers in voor een gemiddelde...";

        // Gemiddelde initialiseren
        antwoordGemiddelde = 0;

        // Cijferaantal initialiseren
        cijferAantal = 0;

    }

    public void paint(Graphics g) {
        // Achtergrondkleur Initialiseren
        setBackground(Color.ORANGE);

        // Stringinhoud en locaties
        g.drawString("\uD835\uDDE1\uD835\uDDD8\uD835\uDDD7\uD835\uDDD8\uD835\uDDE5\uD835\uDDDF\uD835\uDDD4\uD835\uDDE1\uD835\uDDD7\uD835\uDDE6",228,15);
        g.drawString(tekstAntwoordH1,300,45);
        g.drawString(tekstAntwoordH2,300,85);
        g.drawString(tekstAntwoordH3,300,125);
        g.drawString(tekstAntwoordH4,300,165);
        g.drawString(tekstAntwoordH5,300,205);
        g.drawString(tekstAntwoordGemiddelde ,130,255);

        // Textfields setLocation
        tekstVakH1.setLocation(30,30);
        tekstVakH2.setLocation(30,70);
        tekstVakH3.setLocation(30,110);
        tekstVakH4.setLocation(30,150);
        tekstVakH5.setLocation(30,190);

    }

    class TekstVakListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            cijferAantal = 0;
            // Userinputs Declareren en initialiseren
            String userInputH1 = tekstVakH1.getText();
            String userInputH2 = tekstVakH2.getText();
            String userInputH3 = tekstVakH3.getText();
            String userInputH4 = tekstVakH4.getText();
            String userInputH5 = tekstVakH5.getText();

            try {
                antwoordH1 = Double.parseDouble(userInputH1);
                cijferAantal++;
                if (antwoordH1 > 10 || antwoordH1 < 0.0) antwoordH1 = 0.0;
            } catch (Exception exception){
                antwoordH1 = 0.0;
                tekstAntwoordH1 = "Je hebt geen cijfer ingevoerd!";
            }
            try {
                antwoordH2 = Double.parseDouble(userInputH2);
                cijferAantal++;
                if (antwoordH2 > 10 || antwoordH2 < 0.0) antwoordH2 = 0.0;
            } catch (Exception exception){
                antwoordH2 = 0.0;
                tekstAntwoordH2 = "Je hebt geen cijfer ingevoerd!";
            }
            try {
                antwoordH3 = Double.parseDouble(userInputH3);
                cijferAantal++;
                if (antwoordH3 > 10 || antwoordH3 < 0.0) antwoordH3 = 0.0;
            } catch (Exception exception){
                antwoordH3 = 0.0;
                tekstAntwoordH3 = "Je hebt geen cijfer ingevoerd!";
            }
            try {
                antwoordH4 = Double.parseDouble(userInputH4);
                cijferAantal++;
                if (antwoordH4 > 10 || antwoordH4 < 0.0) antwoordH4 = 0.0;
            } catch (Exception exception){
                antwoordH4 = 0.0;
                tekstAntwoordH4 = "Je hebt geen cijfer ingevoerd!";
            }
            try {
                antwoordH5 = Double.parseDouble(userInputH5);
                cijferAantal++;
                if (antwoordH5 > 10 || antwoordH5 < 0.0) antwoordH5 = 0.0;
            } catch (Exception exception){
                antwoordH5 = 0.0;
                tekstAntwoordH5 = "Je hebt geen cijfer ingevoerd!";
            }

            if (antwoordH1 < 5.5) {
                tekstAntwoordH1 = antwoordH1 + " Je hebt een onvoldoende";
            }
            else {tekstAntwoordH1 = antwoordH1 + " Je hebt een voldoende";}

            if (antwoordH2 < 5.5) {
                tekstAntwoordH2 = antwoordH2 + " Je hebt een onvoldoende";
            }
            else {tekstAntwoordH2 = antwoordH2 + " Je hebt een voldoende";}

            if (antwoordH3 < 5.5) {
                tekstAntwoordH3 = antwoordH3 + " Je hebt een onvoldoende";
            }
            else {tekstAntwoordH3 = antwoordH3 + " Je hebt een voldoende";}

            if (antwoordH4 < 5.5) {
                tekstAntwoordH4 = antwoordH4 + " Je hebt een onvoldoende";
            }
            else {tekstAntwoordH4 = antwoordH4 + " Je hebt een voldoende";}

            if (antwoordH5 < 5.5) {
                tekstAntwoordH5 = antwoordH5 + " Je hebt een onvoldoende";
            }
            else {tekstAntwoordH5 = antwoordH5 + " Je hebt een voldoende";}

            if (antwoordH1 == 0.0)
                tekstAntwoordH1 = "Je hebt geen cijfer ingevoerd!";

            if (antwoordH2 == 0.0)
                tekstAntwoordH2 = "Je hebt geen cijfer ingevoerd!";

            if (antwoordH3 == 0.0)
                tekstAntwoordH3 = "Je hebt geen cijfer ingevoerd!";

            if (antwoordH4 == 0.0)
                tekstAntwoordH4 = "Je hebt geen cijfer ingevoerd!";

            if (antwoordH5 == 0.0)
                tekstAntwoordH5 = "Je hebt geen cijfer ingevoerd!";

            // Antwoord gemiddelde berekenen en afronden op een decimaal
            antwoordGemiddelde = (antwoordH1 + antwoordH2 + antwoordH3 + antwoordH4 + antwoordH5);
            antwoordGemiddelde2 = Math.round(((antwoordGemiddelde / cijferAantal) * 10));
            antwoordGemiddelde = antwoordGemiddelde2 / 10;

            // if else statement voor het gemiddelde
            if (antwoordGemiddelde < 5.5)
                tekstAntwoordGemiddelde = "Je gemiddelde is " + antwoordGemiddelde + " je hebt een onvoldoende";
            else {tekstAntwoordGemiddelde = "Je gemiddelde is " + antwoordGemiddelde + " je hebt een voldoende";}

            repaint();
        }
    }
}
