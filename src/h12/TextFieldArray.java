package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class TextFieldArray extends Applet {

    TextField[] textfields = new TextField[5];

    double[] getallenLijst = new double[5];

    Button okKnop;

    public void init() {

        okKnop = new Button("Ok");
        okKnop.addActionListener(new OkKnopListener());
        add(okKnop);

        for (int teller = 0; teller != textfields.length; teller++){
            textfields[teller] = new TextField("tekstvak " + (teller +1));
            add(textfields[teller]);
        }
    }

    public void paint(Graphics g) {

    }

    class OkKnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String userInput1, userInput2, userInput3, userInput4, userInput5;
            double getal1, getal2, getal3, getal4, getal5;

            userInput1 = textfields[0].getText();
            getal1 = Double.parseDouble(userInput1);

            userInput2 = textfields[1].getText();
            getal2 = Double.parseDouble(userInput2);

            userInput3 = textfields[2].getText();
            getal3 = Double.parseDouble(userInput3);

            userInput4 = textfields[3].getText();
            getal4 = Double.parseDouble(userInput4);

            userInput5 = textfields[4].getText();
            getal5 = Double.parseDouble(userInput5);

            getallenLijst[0] = getal1;
            getallenLijst[1] = getal2;
            getallenLijst[2] = getal3;
            getallenLijst[3] = getal4;
            getallenLijst[4] = getal5;

            Arrays.sort(getallenLijst);

            textfields[0].setText(String.valueOf(getallenLijst[0]));
            textfields[1].setText(String.valueOf(getallenLijst[1]));
            textfields[2].setText(String.valueOf(getallenLijst[2]));
            textfields[3].setText(String.valueOf(getallenLijst[3]));
            textfields[4].setText(String.valueOf(getallenLijst[4]));
            repaint();
        }
    }
}
