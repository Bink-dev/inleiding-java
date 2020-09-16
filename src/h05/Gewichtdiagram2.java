package h05;

import java.applet.Applet;
import java.awt.*;

public class Gewichtdiagram2 extends Applet {

    // Variabelen voor x lijn
    int xlijnX,xlijnY,xlijnW,xlijnH;

    // Variabelen voor y lijn
    int ylijnX,ylijnY,ylijnW,ylijnH;

    // Variabelen voor aangevende lijnen
    int lijn1x,lijn1y,lijn1w,lijn1h,lijn2x,lijn2y,lijn2w,lijn2h,lijn3x,lijn3y,lijn3w,lijn3h,lijn4x,lijn4y,lijn4w,lijn4h,lijn5x,lijn5y,lijn5w,lijn5h,lijn6x,lijn6y,lijn6w,lijn6h,lijn7x,lijn7y,lijn7w,lijn7h,lijn8x,lijn8y,lijn8w,lijn8h,lijn9x,lijn9y,lijn9w,lijn9h;

    // Variabelen voor fillrect 1
    int fr1x,fr1y,fr1w,fr1h;

    // Variabelen voor fillrect 2
    int fr2x,fr2y,fr2w,fr2h;

    // Variabelen voor fillrect 3
    int fr3x,fr3y,fr3w,fr3h;

    // Variabelen voor Benamingen
    int t1x,t1y,t2x,t2y,t3x,t3y,t4x,t4y,t5x,t5y,t6x,t6y,t7x,t7y,t8x,t8y,t9x,t9y,t10x,t10y,t11x,t11y,t12x,t12y;

    public void init() {setSize(600,550);
    // X lijn
        xlijnX = 50;
        xlijnY = 100;
        xlijnW = 50;
        xlijnH = 300;

    // Y lijn
        ylijnX = 50;
        ylijnY = 300;
        ylijnW = 300;
        ylijnH = 300;

    // Aangevende lijnen
        lijn1x = 40;
        lijn1y = 300;
        lijn1w = 50;
        lijn1h = 300;

        lijn2x = 40;
        lijn2y = 280;
        lijn2w = 50;
        lijn2h = 280;

        lijn3x = 40;
        lijn3y = 260;
        lijn3w = 50;
        lijn3h = 260;

        lijn4x = 40;
        lijn4y = 240;
        lijn4w = 50;
        lijn4h = 240;

        lijn5x = 40;
        lijn5y = 220;
        lijn5w = 50;
        lijn5h = 220;

        lijn6x = 40;
        lijn6y = 200;
        lijn6w = 50;
        lijn6h = 200;

        lijn7x = 40;
        lijn7y = 180;
        lijn7w = 50;
        lijn7h = 180;

        lijn8x = 40;
        lijn8y = 160;
        lijn8w = 50;
        lijn8h = 160;

        lijn9x = 40;
        lijn9y = 140;
        lijn9w = 50;
        lijn9h = 140;

    // Filled rectangles
        fr1x = 80;
        fr1y = 260;
        fr1w = 25;
        fr1h = 40;

        fr2x = 155;
        fr2y = 200;
        fr2w = 25;
        fr2h = 100;

        fr3x = 230;
        fr3y = 220;
        fr3w = 25;
        fr3h = 80;

    // Benamingen
        t1x = 25;
        t1y = 305;

        t2x = 18;
        t2y = 285;

        t3x = 18;
        t3y = 265;

        t4x = 18;
        t4y = 245;

        t5x = 18;
        t5y = 225;

        t6x = 14;
        t6y = 205;

        t7x = 14;
        t7y = 185;

        t8x = 14;
        t8y = 165;

        t9x = 14;
        t9y = 145;

        t10x = 75;
        t10y = 320;

        t11x = 150;
        t11y = 320;

        t12x = 225;
        t12y = 320;

    }

    public void paint(Graphics g) {
        // X lijn
        g.drawLine(xlijnX,xlijnY,xlijnW,xlijnH);

        // Y lijn
        g.drawLine(ylijnX,ylijnY,ylijnW,ylijnH);

        // Aangevende lijnen
        g.drawLine(lijn1x,lijn1y,lijn1w,lijn1h);
        g.drawLine(lijn2x,lijn2y,lijn2w,lijn2h);
        g.drawLine(lijn3x,lijn3y,lijn3w,lijn3h);
        g.drawLine(lijn4x,lijn4y,lijn4w,lijn4h);
        g.drawLine(lijn5x,lijn5y,lijn5w,lijn5h);
        g.drawLine(lijn6x,lijn6y,lijn6w,lijn6h);
        g.drawLine(lijn7x,lijn7y,lijn7w,lijn7h);
        g.drawLine(lijn8x,lijn8y,lijn8w,lijn8h);
        g.drawLine(lijn9x,lijn9y,lijn9w,lijn9h);

        // Fillrect's
        g.setColor(Color.magenta);
        g.fillRect(fr1x,fr1y,fr1w,fr1h);

        g.setColor(Color.cyan);
        g.fillRect(fr2x,fr2y,fr2w,fr2h);

        g.setColor(Color.green);
        g.fillRect(fr3x,fr3y,fr3w,fr3h);

        // Benamingen
        g.setColor(Color.black);
        g.drawString("0",t1x,t1y);
        g.drawString("20",t2x,t2y);
        g.drawString("40",t3x,t3y);
        g.drawString("60",t4x,t4y);
        g.drawString("80",t5x,t5y);
        g.drawString("100",t6x,t6y);
        g.drawString("120",t7x,t7y);
        g.drawString("140",t8x,t8y);
        g.drawString("160",t9x,t9y);

        g.drawString("Valerie", t10x,t10y);
        g.drawString("Jeroen", t11x,t11y);
        g.drawString("Hans", t12x,t12y);
    }
}
