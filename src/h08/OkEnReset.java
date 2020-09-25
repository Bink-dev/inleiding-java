package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OkEnReset extends Applet {
    // Variabelen voor de knoppen
    Button okKnop, resetKnop;

    // Variabelen voor het tekstvak
    TextField tekstvak;
    String userInput;

    public void init() {
        okKnop = new Button("Ok");
        resetKnop = new Button("Reset");
        tekstvak = new TextField("",50);
        okKnop.addActionListener(new OkKnopListener());
        resetKnop.addActionListener(new ResetKnopListener());
        tekstvak.addActionListener(new OkKnopListener());
        userInput = "";
        add(tekstvak);
        add(okKnop);
        add(resetKnop);
    }

    public void paint(Graphics g) {
        g.drawString(userInput,15,70);
    }

    class OkKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
           userInput = tekstvak.getText();
           repaint();
        }
    }
    class ResetKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            userInput = "";
            repaint();
        }
    }
}
