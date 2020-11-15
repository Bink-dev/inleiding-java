package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    // stap 1 : 2 tekstvakken invoeren.
    // stap 2 : Ok Knop maken.
    // stap 3: informatie uit tekstvak halen met Ok Knop.
    // stap 4: Informatie opslaan in een Array.
    // stap 5: checken of het al 10x gebeurd is. yes> alle ingevoerden namen en telefoonummers op scherm tonen no> niks
    // stap 6: tekstvakken leegmaken.

    TextField tekstVakNaam, tekstVakNummer;

    Label naam, telefoonNummer;

    Button okKnop;

    String[] naamArray = new String[10];
    String userInputNaam1,userInputNaam2,userInputNaam3,userInputNaam4,userInputNaam5,userInputNaam6,userInputNaam7,userInputNaam8,userInputNaam9,userInputNaam10;

    int[] nummerArray = new int[10];
    int userInputNummer1,userInputNummer2,userInputNummer3,userInputNummer4,userInputNummer5,userInputNummer6,userInputNummer7,userInputNummer8,userInputNummer9,userInputNummer10;

    public void init() {
        tekstVakNaam = new TextField("", 4);
        tekstVakNummer = new TextField("", 10);
        naam = new Label("Naam :");
        telefoonNummer = new Label("Telefoonnummer :");
        okKnop = new Button("Ok");
        okKnop.addActionListener(new OkKnopListener());

        add(naam);
        add(tekstVakNaam);
        add(telefoonNummer);
        add(tekstVakNummer);
        add(okKnop);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < naamArray.length && teller < nummerArray.length; teller++){
            if (teller <= 10){
                g.drawString("" + naamArray[teller],70,60 + teller * 25);
                g.drawString("" + nummerArray[teller],200,60 + teller * 25);

            }
        }
    }

    class OkKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            naamArray[0] = userInputNaam1;
            naamArray[1] = userInputNaam2;
            naamArray[2] = userInputNaam3;
            naamArray[3] = userInputNaam4;
            naamArray[4] = userInputNaam5;
            naamArray[5] = userInputNaam6;
            naamArray[6] = userInputNaam7;
            naamArray[7] = userInputNaam8;
            naamArray[8] = userInputNaam9;
            naamArray[9] = userInputNaam10;

            nummerArray[0] = userInputNummer1;
            nummerArray[1] = userInputNummer2;
            nummerArray[2] = userInputNummer3;
            nummerArray[3] = userInputNummer4;
            nummerArray[4] = userInputNummer5;
            nummerArray[5] = userInputNummer6;
            nummerArray[6] = userInputNummer7;
            nummerArray[7] = userInputNummer8;
            nummerArray[8] = userInputNummer9;
            nummerArray[9] = userInputNummer10;

            for (int teller = 0; teller < naamArray.length && teller < nummerArray.length; teller++){
                if (teller == 0){
                    userInputNaam1 = tekstVakNaam.getText();
                    userInputNummer1 = Integer.parseInt(tekstVakNummer.getText());
                }

                if (teller == 1){
                    userInputNaam2 = tekstVakNaam.getText();
                    userInputNummer2 = Integer.parseInt(tekstVakNummer.getText());
                }

                if (teller == 2){
                    userInputNaam3 = tekstVakNaam.getText();
                    userInputNummer3 = Integer.parseInt(tekstVakNummer.getText());
                }

                if (teller == 3){
                    userInputNaam4 = tekstVakNaam.getText();
                    userInputNummer4 = Integer.parseInt(tekstVakNummer.getText());
                }

                if (teller == 4){
                    userInputNaam5 = tekstVakNaam.getText();
                    userInputNummer5 = Integer.parseInt(tekstVakNummer.getText());
                }

                if (teller == 5){
                    userInputNaam6 = tekstVakNaam.getText();
                    userInputNummer6 = Integer.parseInt(tekstVakNummer.getText());
                }

                if (teller == 6){
                    userInputNaam7 = tekstVakNaam.getText();
                    userInputNummer7 = Integer.parseInt(tekstVakNummer.getText());
                }

                if (teller == 7){
                    userInputNaam8 = tekstVakNaam.getText();
                    userInputNummer8 = Integer.parseInt(tekstVakNummer.getText());
                }

                if (teller == 8){
                    userInputNaam9 = tekstVakNaam.getText();
                    userInputNummer9 = Integer.parseInt(tekstVakNummer.getText());
                }

                if (teller == 9){
                    userInputNaam10 = tekstVakNaam.getText();
                    userInputNummer10 = Integer.parseInt(tekstVakNummer.getText());
                }
            }
            repaint();
        }
    }
}
