/**
 * Created by hoite on 11-4-17.
 */


import java.awt.Color;
import java.awt.Graphics;


/**
 * Superklasse van elke vorm
 */
public class Vorm extends Thread {
    //Threads variabelen
    public Graphics g;
    public Color kleur;
    public Color wiskleur = Color.LIGHT_GRAY; //Zelfde kleur als achtergrond
    public boolean running;

    // initialiseren variabelen
    public int x = (int) (400 * Math.random() + 25);
    public int y = (int) (400 * Math.random() + 25);
    public int w = 20;
    public int h = 20;
    public int dx = 3, dy = 2;


    public Vorm(Graphics g){
        //this.zichtbaar = false;
        this.g = g;
        running = true;
    }

    public void run() {
        while (running) {
            teken(kleur);
            slaap(15);
            teken(wiskleur);
            verplaats();
        }
    }

    public void nuStoppen() {
        running = false;
    }

    public void nuStarten() { running = true; }

    public void teken(Color kleur) {

    }

    /**
     * Functie benodigd voor het afsluiten van een thread
     * @param millisec
     */
    public void slaap (int millisec) {
        try {
            Thread.sleep(millisec);
        }
        catch (InterruptedException e) {

        }
    }

    /**
     * Wiskundige bullshit wat ervoor zorgt dat de vorm beweegt
     */
    public void verplaats(){

        if (x +dx <= 1 || x + dx + 25 >= 450 )
            dx = -dx;
        if ( y + dy <= 1 || y + dy + 25 >= 450)
            dy = -dy;

       x += dx; y += dy;

    }


}
