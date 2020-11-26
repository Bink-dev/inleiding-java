package h13;

import java.applet.Applet;
import java.awt.*;

public class BrickWall extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int w = 80;
        int h = 40;
        this.redBrickWall(g,x,y,w,h);

    }

    private void redBrickWall (Graphics g ,int x ,int y ,int w ,int h){
        for (int counter = 0; counter < 700; counter++){
            g.setColor(Color.red);
            g.fillRect(x,y,w,h);
            g.setColor(Color.black);
            g.drawRect(x,y,w,h);
            x += 80;

            if (counter == 23){
                x = -40;
                y += 40;
            }

            if (counter == 48){
                x = 0;
                y += 40;
            }

            if (counter == 72){
                x = -40;
                y += 40;
            }

            if (counter == 97){
                x = 0;
                y += 40;
            }

            if (counter == 121){
                x = -40;
                y += 40;
            }

            if (counter == 146){
                x = 0;
                y += 40;
            }

            if (counter == 170){
                x = -40;
                y += 40;
            }

            if (counter == 195){
                x = 0;
                y += 40;
            }

            if (counter == 219){
                x = -40;
                y += 40;
            }

            if (counter == 244){
                x = 0;
                y += 40;
            }

            if (counter == 268){
                x = -40;
                y += 40;
            }

            if (counter == 293){
                x = 0;
                y += 40;
            }

            if (counter == 317){
                x = -40;
                y += 40;
            }

            if (counter == 342){
                x = 0;
                y += 40;
            }

            if (counter == 366){
                x = -40;
                y += 40;
            }

            if (counter == 391){
                x = 0;
                y += 40;
            }

            if (counter == 415){
                x = -40;
                y += 40;
            }

            if (counter == 440){
                x = 0;
                y += 40;
            }

            if (counter == 464){
                x = -40;
                y += 40;
            }

            if (counter == 489){
                x = 0;
                y += 40;
            }

            if (counter == 513){
                x = -40;
                y += 40;
            }

            if (counter == 538){
                x = 0;
                y += 40;
            }

            if (counter == 562){
                x = -40;
                y += 40;
            }

            if (counter == 587){
                x = 0;
                y += 40;
            }

            if (counter == 611){
                break;
            }
        }
    }
}
