package h04;

import java.applet.Applet;
import java.awt.*;

public class GewichtDiagram extends Applet{

    public void init() {setSize(600,550);}

    public void paint(Graphics g) {
        g.drawLine(50,100,50,300);
        g.drawLine(50,300,300,300);
        g.drawLine(40,300,50,300);
        g.drawLine(40,280,50,280);
        g.drawLine(40,260,50,260);
        g.drawLine(40,240,50,240);
        g.drawLine(40,220,50,220);
        g.drawLine(40,200,50,200);
        g.drawLine(40,180,50,180);
        g.drawLine(40,160,50,160);
        g.drawLine(40,140,50,140);
        g.drawString("Valerie",75,320);
        g.drawString("Jeroen",150,320);
        g.drawString("Hans",225,320);
        g.drawString("0",25,305);
        g.drawString("20",18,285);
        g.drawString("40",18,265);
        g.drawString("60",18,245);
        g.drawString("80",18,225);
        g.drawString("100",14,205);
        g.drawString("120",14,185);
        g.drawString("140",14,165);
        g.drawString("160",14,145);
        g.setColor(Color.magenta);
        g.fillRect(80,260,25,40);
        g.setColor(Color.cyan);
        g.fillRect(155,200,25,100);
        g.setColor(Color.green);
        g.fillRect(230,220,25,80); }
}
