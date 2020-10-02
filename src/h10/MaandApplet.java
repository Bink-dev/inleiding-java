package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaandApplet extends Applet {
    // Variabelen voor Textfield(s)
    TextField tekstvak1,tekstvak2;

    // Variabelen voor String(s)
    String output;

    // Variabelen voor Int(s)
    int januari,februari,maart,april,mei,juni,juli,augustus,september,oktober,november,december,jaartal;

    public void init() {
        // Grootte Applet bepalen
        setSize(600,200);

        // Textfields declareren
       tekstvak1 = new TextField("Vul hier een maandgetal in!");
       tekstvak1.addActionListener(new TekstVakListener());
       add(tekstvak1);
       tekstvak2 = new TextField("vul hier een jaartal in!");
       tekstvak2.addActionListener(new TekstVakListener());
       add(tekstvak2);
       output = "...";

       // Declareren waardes van maanden (dagaantal)
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
        g.drawString(output,100,75);
    }

    class TekstVakListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String userInputMaand = tekstvak1.getText();
            String userInputJaar = tekstvak2.getText();
            jaartal = Integer.parseInt(userInputJaar);

            switch (userInputMaand){
                case "1": output = "Januari " + jaartal + " " + januari + " dagen."; break;
                case "2": output = "Februari " + jaartal + " " + februari + " dagen."; break;
                case "3": output = "Maart " + jaartal + " " + maart + " dagen."; break;
                case "4": output = "April " + jaartal + " " + april + " dagen."; break;
                case "5": output = "Mei " + jaartal + " " + mei + " dagen."; break;
                case "6": output = "Juni " + jaartal + " " + juni + " dagen."; break;
                case "7": output = "Juli " + jaartal + " " + juli + " dagen."; break;
                case "8": output = "Augustus " + jaartal + " " + augustus + " dagen."; break;
                case "9": output = "September " + jaartal + " " + september + " dagen."; break;
                case "10": output = "Oktober" + jaartal + " " + oktober + " dagen."; break;
                case "11": output = "November " + jaartal + " " + november + " dagen."; break;
                case "12": output = "December " + jaartal + " " + december + " dagen."; break;
                default: output = "Een echt maandnummer ;)"; break;

            } repaint();

            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0 )
                februari++;
            else {februari = 28;}
            repaint();
            }
        }
    }

