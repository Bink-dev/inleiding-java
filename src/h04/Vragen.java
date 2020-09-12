package h04;

import java.applet.Applet;
import java.awt.*;

public class Vragen extends Applet {

    public void init() {setSize(860,450);}

    public void paint(Graphics g) {
        g.drawString("Vragen",425,10);
        g.drawString("1. Wat is een platform?",10,40);
        g.drawString("Een platform is een ondergrond waar je op draait en op verder bouwt",10,70);
        g.drawString("2. Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?",10,100);
        g.drawString("Omdat je verder kunt bouwen vanaf het platform, aangezien hier nog niks op gebouwd is",10,130);
        g.drawString("3. Wat is bytecode?",10,160);
        g.drawString("Een bytecode is een machinetaal die niet direct op de processor kan worden uitgevoerd , deze moet via JVM (of ander) naar een echte taal omgezet worden",10,190);
        g.drawString("4. Wat doet JVM?",10,220);
        g.drawString("JVM is een platformonafhankelijke omgeving voor het uitvoeren van Java bytecode",10,250);
        g.drawString("5. Met welke methode kun je een vierkant tekenen?",10,280);
        g.drawString("Met g.drawRect(x,x,x,x); maak je een vierkant, zolang hij maar even lang is aan alle zijdes",10,310);
        g.drawString("6. Noem drie methodes waarmee je een cirkel kunt tekenen",10,340);
        g.drawString("met g.filloval , met getGraphics & met drawcircle",10,370);
        g.drawString("7.Waarom worden opdrachten voor het scherm in paint() gezet en niet in een andere methode?",10,400);
        g.drawString("Omdat hoogstwaarschijnlijk je codering niet verschijnt op je applet, dit zijn de graphics die hij 'paint'",10,430);}
}
