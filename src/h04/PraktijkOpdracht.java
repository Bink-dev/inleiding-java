package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    public void init() {setSize(1200,400);}

    public void paint(Graphics g) {
        g.drawLine(20,20,320,20);
        g.drawRect(20,50,300,150);
        g.drawRoundRect(20,230,300,150,30,30);
        g.setColor(Color.MAGENTA);
        g.fillRect(360,50,300,150);
        g.setColor(Color.BLACK);
        g.drawOval(360,50,300,150);
        g.setColor(Color.MAGENTA);
        g.fillOval(360,230,300,150);
        g.setColor(Color.MAGENTA);
        g.fillArc(700,50,300,150,0,45);
        g.setColor(Color.BLACK);
        g.drawOval(700,50,300,150);
        g.drawOval(800,230,150,150);
        g.drawString("Lijn",155,40);
        g.drawString("Rechthoek",135,220);
        g.drawString("Afgeronde rechthoek",110,400);
        g.drawString("Gevulde rechthoek met ovaal",420,220);
        g.drawString("Gevulde ovaal",470,400);
        g.drawString("Taartpunt met ovaal eromheen",770,220);
        g.drawString("Cirkel",858,400);


    }
}
