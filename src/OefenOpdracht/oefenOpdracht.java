package OefenOpdracht;

import java.applet.Applet;
import java.awt.*;

public class oefenOpdracht extends Applet {
    // Variabele gegeven getal
    int gegevenGetal;

    // Varaibele som
    int totaalSom;

    public void init() {
        gegevenGetal = 13;

        for (int i = 1; i <= gegevenGetal; i++){
            if (i % 2 == 0 && i % 6 != 0){
                System.out.println(i);
                totaalSom = totaalSom + i;
            }

            if (i % 6 == 0){
                System.out.println(i*i);
                totaalSom = totaalSom + (i*i);
            }
        }
        System.out.println(totaalSom);
    }

    public void paint(Graphics g) {

    }
}
