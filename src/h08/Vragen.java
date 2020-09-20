package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vragen extends Applet {
    Button knop;
    TextField tekstvak;

    public void init()
    {setSize(1000,500);
    setBackground(Color.blue);
    tekstvak = new TextField("Het behandelen van \"events\", Dus als jij op een knop klikt dat er een reactie onstaat op die \"event\"",74);
    knop = new Button("Klik mij maar ;)");
    knop.addActionListener(new Knop());
    add(tekstvak);
    add(knop);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawString("1. Wat is event-handling?",20,20);
        g.drawString("2. wat is een gebruikers interface?",20,45);
        g.drawString("Een gebruikers interface is wat de gebruiker ziet op zijn schermpje of beeld in bijvoorbeeld een app",20,65);
        g.drawString("3. Waarom moet er voor een knop wel en voor een tekst geen event-handling geprogrammeerd worden?",20,85);
        g.drawString("Waarschijnlijk omdat een knop een handeling doet als je die gebruikt en een tekst niet",20,105);
        g.drawString("4. Wat is een lege string?",20,125);
        g.drawString("Een lege string is een string zonder waarde, er staat niks in",20,145);
        g.drawString("5. Wat is het verschil tussen een tekstvak en een label?",20,165);
        g.drawString("In een tekstvak heb je de mogelijkheid om te typen en een label niet",20,185);
        g.drawString("6. Waarom moeten getallen uit een tekstvak altijd geconverteerd worden naar een double of een int?",20,205);
        g.drawString("Omdat hij dan de nummers herkend",20,225);


    }

    class Knop implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Dit is dus een event-handeling!");
            repaint();
        }
    }






}
