package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    TextField textFieldName, textFieldNumber;

    Label name, phoneNumber;

    Button okButton;

    String[] nameArray = new String[10];
    String userInputName1, userInputName2, userInputName3, userInputName4, userInputName5, userInputName6, userInputName7, userInputName8, userInputName9, userInputName10;

    int[] numberArray = new int[10];
    int userInputNumber1, userInputNumber2, userInputNumber3, userInputNumber4, userInputNumber5, userInputNumber6, userInputNumber7, userInputNumber8, userInputNumber9, userInputNumber10;

    int globalCounter = 0;

    public void init() {

        textFieldName = new TextField("", 4);
        textFieldNumber = new TextField("", 10);
        name = new Label("Name :");
        phoneNumber = new Label("Telephone Number :");
        okButton = new Button("Ok");
        okButton.addActionListener(new OkButtonListener());

        add(name);
        add(textFieldName);
        add(phoneNumber);
        add(textFieldNumber);
        add(okButton);
    }

    public void paint(Graphics g) {

        for (int counter = 0; counter < nameArray.length && counter < numberArray.length; counter++){

            if (globalCounter == 10){
                System.out.println(counter);
                g.drawString("" + nameArray[counter],70,60 + counter * 25);
                g.drawString("" + numberArray[counter],200,60 + counter * 25);

            }
        }
    }

    class OkButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

                if (globalCounter == 0){
                    userInputName1 = textFieldName.getText();
                    userInputNumber1 = Integer.parseInt(textFieldNumber.getText());
                }

                if (globalCounter == 1){
                    userInputName2 = textFieldName.getText();
                    userInputNumber2 = Integer.parseInt(textFieldNumber.getText());
                }

                if (globalCounter == 2){
                    userInputName3 = textFieldName.getText();
                    userInputNumber3 = Integer.parseInt(textFieldNumber.getText());
                }

                if (globalCounter == 3){
                    userInputName4 = textFieldName.getText();
                    userInputNumber4 = Integer.parseInt(textFieldNumber.getText());
                }

                if (globalCounter == 4){
                    userInputName5 = textFieldName.getText();
                    userInputNumber5 = Integer.parseInt(textFieldNumber.getText());
                }

                if (globalCounter == 5){
                    userInputName6 = textFieldName.getText();
                    userInputNumber6 = Integer.parseInt(textFieldNumber.getText());
                }

                if (globalCounter == 6){
                    userInputName7 = textFieldName.getText();
                    userInputNumber7 = Integer.parseInt(textFieldNumber.getText());
                }

                if (globalCounter == 7){
                    userInputName8 = textFieldName.getText();
                    userInputNumber8 = Integer.parseInt(textFieldNumber.getText());
                }

                if (globalCounter == 8){
                    userInputName9 = textFieldName.getText();
                    userInputNumber9 = Integer.parseInt(textFieldNumber.getText());
                }

                if (globalCounter == 9){
                    userInputName10 = textFieldName.getText();
                    userInputNumber10 = Integer.parseInt(textFieldNumber.getText());
                }

                globalCounter++;
                textFieldNumber.setText("");
                textFieldName.setText("");

                nameArray[0] = userInputName1;
                nameArray[1] = userInputName2;
                nameArray[2] = userInputName3;
                nameArray[3] = userInputName4;
                nameArray[4] = userInputName5;
                nameArray[5] = userInputName6;
                nameArray[6] = userInputName7;
                nameArray[7] = userInputName8;
                nameArray[8] = userInputName9;
                nameArray[9] = userInputName10;

                numberArray[0] = userInputNumber1;
                numberArray[1] = userInputNumber2;
                numberArray[2] = userInputNumber3;
                numberArray[3] = userInputNumber4;
                numberArray[4] = userInputNumber5;
                numberArray[5] = userInputNumber6;
                numberArray[6] = userInputNumber7;
                numberArray[7] = userInputNumber8;
                numberArray[8] = userInputNumber9;
                numberArray[9] = userInputNumber10;

            repaint();
        }
    }
}
