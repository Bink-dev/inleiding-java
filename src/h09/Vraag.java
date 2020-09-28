package h09;

import java.applet.Applet;
import java.awt.*;

public class Vraag extends Applet {

    public void init() {setSize(660,120); }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.drawString("Hoe vindt de communicatie plaats tussen besturingssysteem (OS) en de applet uit voorbeeld 8.7?",20,20);
        g.drawString("Een OS (Operating system) is een ondergrond aan codes netzoals deze repository voor deze opdrachten.",20,40);
        g.drawString("Deze ondergrond herkent je code en voert hem gedeeltelijk voor je uit in samenwerking met met je applet en intelliJ.",20,60);
        g.drawString("vaak is dit met MacOS windows en andere OS.",20,80);

    }

}
