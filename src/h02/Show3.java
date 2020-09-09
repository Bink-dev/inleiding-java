package h02;

import java.applet.Applet;
import java.awt.*;

public class Show3 extends Applet {

    public void init() {setSize(850,350); }

    public void paint(Graphics g) {
        g.drawString("Vragen",425,10);
        g.drawString("1. Wat is machinetaal?",10,40);
        g.drawString("Machinetaal is een taal waarin instructies geschreven zijn die de processor van een computer direct kan uitvoeren",10,70);
        g.drawString("2. Welke drie hulpmiddelen heb je nodig om te programmeren?",10,100);
        g.drawString("IntelliJ, Git(hub) & Oracle",10,130);
        g.drawString("3. Hoe herken je opdrachten in de broncode?",10,160);
        g.drawString("Opdrachten eindigen met een punt comma",10,190);
        g.drawString("4. Waartoe dienen de import-opdrachten?",10,220);
        g.drawString("De importo-pdrachten dienen tot het 'importeren' van bepaalde commands en opdrachten die je wil gebruiken,bijv. paint of init die vallen onder applet",10,250);
        g.drawString("5. Wat is een methode?",10,280);
        g.drawString("Een methode bestaat uit een aantal opdrachten met een naam erboven, Deze staan tussen accolades",10,310); }
}
