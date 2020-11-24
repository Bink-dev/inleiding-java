package h13;

import java.applet.Applet;
import java.awt.*;

public class tekenDriehoek extends Applet {
    TextField numberOne;

    public void init() {
        setSize(400,400);
        drawConcreteWall();
    }

    public void paint(Graphics g) {
        int x1 = 10;
        int y1 = 100;
        int x2 = 20;
        int y2 = 20;
        int x3 = 30;
        int y3 = 100;
        this.tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
        System.out.println(add(3, 4));
        System.out.println(add(5, 3));
        System.out.println(add(34, 13));
    }

    private void tekenDriehoek (Graphics g,int x1, int y1, int x2, int y2, int x3, int y3){
        g.drawPolygon(new int[]{x1, x2, x3}, new int[]{y1, y2, y3}, 3);
        System.out.println(x1);
    }
    private int add (int x, int y){
        return x + y;
    }
     private void drawConcreteWall (){
       // for (){

        }

    //}
}
