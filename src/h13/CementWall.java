package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CementWall extends Applet {

    Button buttonRed,buttonGray;

    public void init() {
        buttonGray = new Button("Concrete");
        buttonRed = new Button("Brick");
        buttonRed.addActionListener(new brickButtonListener());
        buttonGray.addActionListener(new cementButtonListener());
        add(buttonRed);
        add(buttonGray);
    }

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int w = 180;
        int h = 70;
        this.greyCementWall(g,x,y,w,h);

    }

    class brickButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }

    class cementButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }

    private void greyCementWall(Graphics g,int x,int y,int w,int h){
        for (int counter = 0; counter < 200; counter++){
            g.setColor(Color.gray);
            g.fillRect(x,y,w,h);
            g.setColor(Color.black);
            g.drawRect(x,y,w,h);
            x += 180;

            if (counter == 11){
                x = -150;
                y += 70;
            }

            if (counter == 23){
                x = -100;
                y += 70;
            }

            if (counter == 35){
                x = -50;
                y += 70;
            }

            if (counter == 46){
                x = 0;
                y += 70;
            }

            if (counter == 57){
                x = -150;
                y += 70;
            }

            if (counter == 69){
                x = -100;
                y += 70;
            }

            if (counter == 81){
                x = -50;
                y += 70;
            }

            if (counter == 92){
                x = 0;
                y += 70;
            }

            if (counter == 103){
                x = -150;
                y += 70;
            }

            if (counter == 115){
                x = -100;
                y += 70;
            }

            if (counter == 127){
                x = -50;
                y += 70;
            }

            if (counter == 138){
                x = 0;
                y += 70;
            }

            if (counter == 149){
                x = -150;
                y += 70;
            }

            if (counter == 161){
                break;
            }
        }
    }
}
