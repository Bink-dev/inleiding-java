package h07;

import java.applet.Applet;
import java.awt.*;

public class Vragen extends Applet {

    public void init() {setSize(700,200);}

    public void paint(Graphics g) {
        g.drawString("1. Kan je de java setSize vinden in de JAVA API?",20,40);
        g.drawString("java.applet.Applet, ik denk dat deze het framewerk runt aangezien het vanzelfsprekend lijkt vanwege de Applet in de naam",20,60);
        g.drawString("2. In welke klasse wordt deze methode gedefinieerd?",20,80);
        g.drawString("java.applet ?",20,100);
        g.drawString("3. Dezelfde klasse heeft een tweede methode met dezelfde naam. Wat is het verschil?",20,120);
        g.drawString("De laatste heeft een heeft een hoofdletter en is waarschijnlijk een side ipv main methode?",20,140);


    }
}
