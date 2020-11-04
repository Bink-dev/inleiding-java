package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElementArray extends Applet {
    String gevonden;

    String userInput;

    int[] getalArray = new int[20];

    Button okKnop;

    TextField tekstvak;

    int aantalGevonden,userInputInt;

    public void init() {
        setSize(500,500);
        getalArray[0] = 8;
        getalArray[1] = 8;
        getalArray[2] = 8;
        getalArray[3] = 9;
        getalArray[4] = 9;
        getalArray[5] = 10;
        getalArray[6] = 10;
        getalArray[7] = 10;
        getalArray[8] = 10;
        getalArray[9] = 8;
        getalArray[10] = 11;
        getalArray[11] = 11;
        getalArray[12] = 11;
        getalArray[13] = 12;
        getalArray[14] = 14;
        getalArray[15] = 5;
        getalArray[16] = 5;
        getalArray[17] = 5;
        getalArray[18] = 19;
        getalArray[19] = 19;

        tekstvak = new TextField("voer een getal in");
        okKnop = new Button("Ok");
        okKnop.addActionListener(new OkKnopListener());
        add(tekstvak);
        add(okKnop);

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getalArray.length; teller++){
            g.setColor(Color.WHITE);
            g.drawString("" + getalArray[teller],240,100 + teller * 20);
            if (aantalGevonden == 0){
                setBackground(Color.RED);
            }else {
                setBackground(Color.green);
            }
        }
        g.drawString("Getal gevonden is: " + gevonden + " namelijk het getal is : " + aantalGevonden + " keer gevonden!", 80, 60);
    }

    class OkKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            userInput = tekstvak.getText();
            userInputInt = Integer.parseInt(userInput);

            aantalGevonden = 0;
            for (int teller = 0; teller < getalArray.length; teller++){
                if (getalArray[teller] == userInputInt) aantalGevonden++;
            }
            if (aantalGevonden == 0){
                gevonden = "Niet Waar";
            } else {
                gevonden = "Waar";
            }
            repaint();

        }
    }
}
