package h11;

import java.applet.Applet;
import java.awt.*;

public class Vragen extends Applet {

    public void init() {
        setSize(850,300);

    }

    public void paint(Graphics g) {
        g.drawString("1. Wat is het verschil tussen een while- en een for-lus?",20,20);
        g.drawString("Het verschil is bij een for-lus word er automatisch voorwaarden geevalueerd, bij een while en do-while statement de programmeur dat zelf moet doen.",20,40);
        g.drawString("2. Wat is het nesten van lussen?",20,60);
        g.drawString("Dat er een lus in een lus kan voorkomen. en dit wil je ontwijken.",20,80);
        g.drawString("3. Bekijk de volgende broncode. int eind = 5;\n" + "for(int i = 10;  i < eind;  i++) {\n" + "     ....\n" + "     ....\n" + "}" + " Wordt de lus uitgevoerd? Geef een verklaring voor je antwoord",20,100);
        g.drawString("Nee, De i int is groter dan de eind int",20,120);

    }
}
