package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndexTabel extends Applet {
    boolean gevonden,eerstePoging;

    Button okKnop;

    TextField tekstvak;

    Double[] getallen = {3.8,4.6,4.8,6.7,8.3,6.4,7.9,8.6,9.1,9.4};

    double gezocht;

    int index;

    public void init() {
        tekstvak = new TextField("Voer een getal in");
        okKnop = new Button("Ok");
        okKnop.addActionListener(new OkKnopListener());
        add(tekstvak);
        add(okKnop);

        eerstePoging = true;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getallen.length; teller++){
            g.drawString("" + getallen[teller],50,20 * teller + 20);// als je hier break; neerzet word de loop gestopt zodra de waarde is gevonden.
        }

        if (eerstePoging){

        }
        else{

            if (gevonden) {
                g.drawString("Waarde gevonden op index " + index,120,120);
            }
            else {
                g.drawString("Waarde niet gevonden!",120,120);
            }
        }
    }

    class OkKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            eerstePoging = false;
            gezocht = Double.parseDouble(tekstvak.getText());
            gevonden = false;

            for (int i = 0; i < getallen.length; i++) {
                if (gezocht == getallen[i]){
                    gevonden = true;
                    index = i;

                }
            }
            repaint();
        }
    }
}
