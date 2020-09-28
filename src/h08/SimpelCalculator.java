package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpelCalculator extends Applet {
    // Variabelen voor de Button(s)
    Button delen,vermenigvuldigen,optellen,aftrekken;

    // Variabelen voor de Textfield(s)
    TextField tekstvak1,tekstvak2;

    // Variabelen voor de User input(s)
    String userInput1, userInput2;

    // Variabelen voor het Antwoord
    double antwoord;

    public void init() {
        // Applet size
        setSize(400,100);

        // Tekstvak 1
        tekstvak1 = new TextField("",12);
        tekstvak1.addActionListener(new DeelKnopListener());
        tekstvak1.addActionListener(new VermenigvuldigKnopListener());
        tekstvak1.addActionListener(new OptelKnopListener());
        tekstvak1.addActionListener(new AftrekKnopListener());
        add(tekstvak1);

        // Tekstvak 2
        tekstvak2 = new TextField("",12);
        tekstvak2.addActionListener(new DeelKnopListener());
        tekstvak2.addActionListener(new VermenigvuldigKnopListener());
        tekstvak2.addActionListener(new OptelKnopListener());
        tekstvak2.addActionListener(new AftrekKnopListener());
        add(tekstvak2);

        // User Input
        userInput1 = "";
        userInput2 = "";

        // Buttons
        delen = new Button(" / ");
        delen.addActionListener(new DeelKnopListener());
        add(delen);

        vermenigvuldigen = new Button(" * ");
        vermenigvuldigen.addActionListener(new VermenigvuldigKnopListener());
        add(vermenigvuldigen);

        optellen = new Button(" + ");
        optellen.addActionListener(new OptelKnopListener());
        add(optellen);

        aftrekken = new Button(" - ");
        aftrekken.addActionListener(new AftrekKnopListener());
        add(aftrekken);

    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);

    }

    class DeelKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            userInput1 = tekstvak1.getText();
            userInput2 = tekstvak2.getText();
            antwoord = Double.parseDouble(userInput1) / Double.parseDouble(userInput2);
            tekstvak1.setText(String.valueOf(antwoord));
            tekstvak2.setText("");
            repaint();

        }
    }
    class VermenigvuldigKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            userInput1 = tekstvak1.getText();
            userInput2 = tekstvak2.getText();
            antwoord = Double.parseDouble(userInput1) * Double.parseDouble(userInput2);
            tekstvak1.setText(String.valueOf(antwoord));
            tekstvak2.setText("");
            repaint();

        }
    }

    class OptelKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            userInput1 = tekstvak1.getText();
            userInput2 = tekstvak2.getText();
            antwoord = Double.parseDouble(userInput1) + Double.parseDouble(userInput2);
            tekstvak1.setText(String.valueOf(antwoord));
            tekstvak2.setText("");
            repaint();

        }
    }

    class AftrekKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            userInput1 = tekstvak1.getText();
            userInput2 = tekstvak2.getText();
            antwoord = Double.parseDouble(userInput1) - Double.parseDouble(userInput2);
            tekstvak1.setText(String.valueOf(antwoord));
            tekstvak2.setText("");
            repaint();

        }
    }

}
