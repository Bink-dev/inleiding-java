package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaandApplet extends Applet {
    // Variabelen voor Textfield(s)
    TextField tekstvak;

    // Variabelen voor String(s)
    String maand;

    // Variabelen voor Int(s)
    int januari,februari,maart,april,mei,juni,juli,augustus,september,oktober,november,december;

    public void init() {
        setSize(400,100);
       tekstvak = new TextField("Vul hier je maandgetal in!");
       tekstvak.addActionListener(new TekstVakListener());
       add(tekstvak);
       maand = "...";

       // declareren waardes van maanden (dagaantal)
        januari = 31;
        februari = 28;
        maart = 31;
        april = 30;
        mei = 31;
        juni = 30;
        juli = 31;
        augustus = 31;
        september = 30;
        oktober = 31;
        november = 30;
        december = 31;
    }

    public void paint(Graphics g) {
        g.drawString(maand,70,75);

    }

    class TekstVakListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();

            switch (userInput){
                case "1": maand = "Januari " + januari + " dagen."; break;
                case "2": maand = "Februari " + februari + " dagen. Let op in een schrikkeljaar 29!"; break;
                case "3": maand = "Maart " + maart + " dagen."; break;
                case "4": maand = "April " + april + " dagen."; break;
                case "5": maand = "Mei " + mei + " dagen."; break;
                case "6": maand = "Juni " + juni + " dagen."; break;
                case "7": maand = "Juli " + juli + " dagen."; break;
                case "8": maand = "Augustus " + augustus + " dagen."; break;
                case "9": maand = "September " + september + " dagen."; break;
                case "10": maand = "Oktober" + oktober + " dagen."; break;
                case "11": maand = "November " + november + " dagen."; break;
                case "12": maand = "December " + december + " dagen."; break;
                default: maand = "..."; break;
            }
            repaint();
        }
    }
}
