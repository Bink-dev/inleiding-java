package h13;

import java.applet.Applet;
import java.awt.*;

public class BrickWall extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        Color baksteenkleur = new Color(203,50,40);
        redBrickWall(g,-60,0,120,40,17,25,baksteenkleur);
    }

    private void redBrickWall (Graphics g ,int x ,int y ,int w ,int h,int rij,int kolom,Color kleur){
        for (int counter = 0; counter < kolom; counter++){
            for (int teller = 0; teller < rij; teller++){
                if (counter % 2 == 0) {
                    g.setColor(kleur);
                    g.fillRect(x + w / 2 + teller * w, y + counter * h, w, h);
                    g.setColor(Color.black);
                    g.drawRect(x + w / 2 + teller * w, y + counter * h, w, h);
                }
                else{
                    g.setColor(kleur);
                    g.fillRect(x + teller * w,y + counter * h,w,h);
                    g.setColor(Color.black);
                    g.drawRect(x + teller * w,y + counter * h,w,h);
                }
            }
        }
    }
}
