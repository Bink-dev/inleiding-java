package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrootsteNummer extends Applet {
    // Variabelen voor Textfield(s)
    TextField tekstvak;

    // Variabelen voor Double(s)
    double hoogsteNummer,laagsteNummer;

    // Variabelen voor ??


    public void init() {
        tekstvak = new TextField("Vul een getal in en druk enter!");
        tekstvak.addActionListener(new TekstVakListener());
        add(tekstvak);

        hoogsteNummer = -214799999;
        laagsteNummer = 214799999;
    }

    public void paint(Graphics g) {
        g.drawString("Hoogste nummer " + hoogsteNummer,130,70);
        g.drawString("Laagste nummer " + laagsteNummer,130,90);

    }

    class TekstVakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
           double userinput = Double.parseDouble(tekstvak.getText());
           if (userinput > hoogsteNummer){
               hoogsteNummer = userinput;}
           if (userinput < laagsteNummer){
               laagsteNummer = userinput;}

            tekstvak.setText("");
           repaint();
        }
    }
}
