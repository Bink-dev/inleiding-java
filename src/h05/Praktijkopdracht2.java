package h05;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht2 extends Applet {

    // Variabelen voor de lijn
    int lengteLijn, hoogteLijn, eindlengteLijn, eindhoogteLijn;

    // Variabelen voor de rechthoek
    int lengteRechthoek, hoogteRechthoek, eindlengteRechthoek, eindhoogteRechthoek;

    // Variabelen voor de rounded rechthoek
    int lengteroundedRechthoek, hoogteroundedRechthoek, eindlengteroundedRechthoek, eindhoogteroundedRechthoek, arcRechthoek, arc2rechthoek;

    // Variabelen voor de gevulde rechthoek met ovaal
    int lengteR, hoogteR, eindlengteR, eindhoogteR, lengteO, hoogteO, eindlengteO, eindhoogteO;

    // Variabelen voor de gevulde ovaal
    int lengteGO, hoogteGO, eindlengteGO, eindhoogteGO;

    // Variabelen voor de taartpunt met ovaal
    int lengteT, hoogteT, eindlengteT, eindhoogteT, arcT, arcT2, lengteTO, hoogteTO, eindlengteTO, eindhoogteTO;

    // Variabelen voor de cirkel
    int lengteC, hoogteC, eindlengteC, eindhoogteC;

    // Variabelen voor de benamingen
    int lengteT1, hoogteT1, lengteT2, hoogteT2, lengteT3, hoogteT3, lengteT4, hoogteT4, lengteT5, hoogteT5, lengteT6, hoogteT6, lengteT7, hoogteT7;

    public void init() {setSize(1200,400);
    // Lijn
        lengteLijn = 20;
        hoogteLijn = 20;
        eindlengteLijn = 320;
        eindhoogteLijn = 20;

    // Rechthoek
        lengteRechthoek = 20;
        hoogteRechthoek = 50;
        eindlengteRechthoek = 300;
        eindhoogteRechthoek = 150;

    // Rounded Rechthoek
        lengteroundedRechthoek = 20;
        hoogteroundedRechthoek = 230;
        eindlengteroundedRechthoek = 300;
        eindhoogteroundedRechthoek = 150;
        arcRechthoek = 30;
        arc2rechthoek = 30;

    // Gevulde rechthoek met ovaal
        lengteR = 360;
        hoogteR = 50;
        eindlengteR = 300;
        eindhoogteR = 150;

        lengteO = 360;
        hoogteO = 50;
        eindlengteO = 300;
        eindhoogteO = 150;

    // Gevulde ovaal
        lengteGO = 360;
        hoogteGO = 230;
        eindlengteGO = 300;
        eindhoogteGO = 150;

    // Taartpunt met ovaal
        lengteT = 700;
        hoogteT = 50;
        eindlengteT = 300;
        eindhoogteT = 150;
        arcT = 0;
        arcT2 = 45;

        lengteTO = 700;
        hoogteTO = 50;
        eindlengteTO = 300;
        eindhoogteTO = 150;

    // Cirkel
        lengteC = 800;
        hoogteC = 230;
        eindlengteC = 150;
        eindhoogteC = 150;

    // Benamingen
        lengteT1 = 155;
        hoogteT1 = 40;

        lengteT2 = 135;
        hoogteT2 = 220;

        lengteT3 = 110;
        hoogteT3 = 400;

        lengteT4 = 420;
        hoogteT4 = 220;

        lengteT5 = 470;
        hoogteT5 = 400;

        lengteT6 = 770;
        hoogteT6 = 220;

        lengteT7 = 858;
        hoogteT7 = 400;
    }

    public void paint(Graphics g) {
        // Lijn
        g.drawLine(lengteLijn,hoogteLijn,eindlengteLijn,eindhoogteLijn);

        // Rechthoek
        g.drawRect(lengteRechthoek,hoogteRechthoek,eindlengteRechthoek,eindhoogteRechthoek);

        // Rounded Rechthoek
        g.drawRoundRect(lengteroundedRechthoek,hoogteroundedRechthoek,eindlengteroundedRechthoek,eindhoogteroundedRechthoek,arcRechthoek,arc2rechthoek);

        // Gevulde rechthoek met ovaal
        g.setColor(Color.MAGENTA);
        g.fillRect(lengteR,hoogteR,eindlengteR,eindhoogteR);
        g.setColor(Color.BLACK);
        g.drawOval(lengteO,hoogteO,eindlengteO,eindhoogteO);

        // Gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillRect(lengteGO,hoogteGO,eindlengteGO,eindhoogteGO);

        // Taartpunt met ovaal
        g.setColor(Color.MAGENTA);
        g.fillArc(lengteT,hoogteT,eindlengteT,eindhoogteT,arcT,arcT2);
        g.setColor(Color.BLACK);
        g.drawOval(lengteTO,hoogteTO,eindlengteTO,eindhoogteTO);

        // Cirkel
        g.drawOval(lengteC,hoogteC,eindlengteC,eindhoogteC);

        // Benaming
        g.drawString("Lijn",lengteT1,hoogteT1);
        g.drawString("Rechthoek",lengteT2,hoogteT2);
        g.drawString("Afgeronde rechthoek",lengteT3,hoogteT3);
        g.drawString("Gevulde rechthoek met ovaal",lengteT4,hoogteT4);
        g.drawString("Gevulde ovaal",lengteT5,hoogteT5);
        g.drawString("Taartunt met ovaal eromheen",lengteT6,hoogteT6);
        g.drawString("Cirkel",lengteT7,hoogteT7);
    }
}
