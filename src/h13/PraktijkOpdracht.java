package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    boolean boom,boomgaard;

    Button boomKnop,boomGaardKnop;

    public void init() {
        boom = false;
        boomgaard = false;
        boomKnop = new Button("Boom");
        boomGaardKnop = new Button("Boomgaard");
        boomKnop.addActionListener(new boomListener());
        boomGaardKnop.addActionListener(new boomGaardListener());
        add(boomKnop);
        add(boomGaardKnop);

    }

    public void paint(Graphics g) {
        Color bladkleur = new Color(0,110,30);
        Color boomkleur = new Color(60,35,15);

        if (boom){
            boomgaard(g,300,300,50,200,245,180,160,160,1,1,boomkleur,bladkleur);
        }else if (boomgaard){
            boomgaard(g,300,300,50,200,245,180,160,160,2,5,boomkleur,bladkleur);
        }

    }

    class boomGaardListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            boomgaard = true;
            boom = false;
            repaint();
        }
    }

    class boomListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            boom = true;
            boomgaard = false;
            repaint();
        }
    }

    private void boomgaard (Graphics g,int xS,int yS,int wS,int hS,int xC,int yC,int wC,int hC,int rij,int kolom,Color boomkleur,Color bladkleur){
        for (int teller = 0; teller < kolom; teller ++){
            for (int counter = 0; counter < rij; counter++){
                if (boomgaard){
                    g.setColor(boomkleur);
                    g.fillRect(xS + teller * wS,yS + counter * hS,wS,hS);
                    g.setColor(bladkleur);
                    g.fillOval(xC + teller * wC,yC + counter * hC,wC,hC);
                }else if (boom){
                    g.setColor(boomkleur);
                    g.fillRect(xS,yS,wS,hS);
                    g.setColor(bladkleur);
                    g.fillOval(xC,yC,wC,hC);
                }
            }
        }
    }
}
