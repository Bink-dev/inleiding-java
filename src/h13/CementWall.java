package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CementWall extends Applet {
    boolean brick , cement;

    Button buttonRed,buttonGray;

    public void init() {
        brick = false;
        cement = false;
        buttonGray = new Button("Concrete");
        buttonRed = new Button("Brick");
        buttonRed.addActionListener(new brickButtonListener());
        buttonGray.addActionListener(new cementButtonListener());
        add(buttonRed);
        add(buttonGray);
    }

    public void paint(Graphics g) {
        Color baksteenkleur = new Color(203,50,40);
        Color cementkleur = new Color(80,80,90);

        if (brick){
            greyCementWall(g,-60,0,120,40,25,17,baksteenkleur);
        }
        else if (cement){
            greyCementWall(g,-100,0,150,125,8,14,cementkleur);
        }
    }

    class brickButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            brick = true;
            cement = false;
            repaint();
        }
    }

    class cementButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            brick = false;
            cement = true;
            repaint();
        }
    }

    private void greyCementWall(Graphics g,int x,int y,int w,int h,int rij, int kolom,Color kleur){
        for (int teller = 0; teller < kolom; teller++){
            for (int counter = 0; counter < rij; counter++){
                if (counter % 2 == 0){
                    g.setColor(kleur);
                    g.fillRect(x + w / 2 + teller * w, y + counter * h,w,h);
                    g.setColor(Color.black);
                    g.drawRect( x + w / 2 + teller * w,y + counter * h,w,h);
                }else{
                    g.setColor(kleur);
                    g.fillRect(x + teller * w,y + counter * h,w,h);
                    g.setColor(Color.black);
                    g.drawRect(x + teller * w,y + counter * h,w,h);
                }
            }
        }
    }
}
