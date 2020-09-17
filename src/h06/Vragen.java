package h06;

import java.applet.Applet;
import java.awt.*;

public class Vragen extends Applet {

    // Variabelen voor de vragen
    int t1x,t1y,t2x,t2y,t3x,t3y,t4x,t4y,t5x,t5y,t6x,t6y,t7x,t7y,t8x,t8y;

    public void init() {setSize(750,260);
    t1x = 20;
    t1y = 20;
    t2x = 20;
    t2y = 50;
    t3x = 20;
    t3y = 80;
    t4x = 20;
    t4y = 110;
    t5x = 20;
    t5y = 140;
    t6x = 20;
    t6y = 170;
    t7x = 20;
    t7y = 200;
    t8x = 20;
    t8y = 230;

    }

    public void paint(Graphics g) {

        // Vragen
        g.drawString("1. Waarom is initialiseren van variabelen noodzakelijk?",t1x,t1y);
        g.drawString("Anders weet je niet welke waarde in een variabele staat",t2x,t2y);
        g.drawString("2. Waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?",t3x,t3y);
        g.drawString("Casting heb je nodig om een variabele van een bepaald type voor een ander type te laten doorgaan",t4x,t4y);
        g.drawString("3. Wat is de uitvoer van dit programma? Geef een verklaring",t5x,t5y);
        g.drawString("Er word een berekening gemaakt, eerst tussen de haken en daarna erachter",t6x,t6y);
        g.drawString("4. In de regel uitkomst = (a + b) / c; laat je de ronde haken weg. Wat is de uitvoer van dit programma? Geef een verklaring.",t7x,t7y);
        g.drawString("Er word opnieuw een berekening gemaakt, maar nu gaat de x voor de uitkomst zal veranderen",t8x,t8y);}
}
