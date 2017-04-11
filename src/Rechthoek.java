import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Created by hoite on 4-4-17.
 */
public class Rechthoek {
    private Color kleur;
    private int x = 100;
    private int y = 200;
    private int breedte;
    private int hoogte;
    private int grootte;
    private int dx = 3;
    private int dy = 2;
    private boolean zichtbaar;

    private ReactieModel model;
    private ReactieView view;

    public Rechthoek(Color kleur, int x, int y, int breedte, int hoogte) {
        this.kleur = kleur;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;

        zichtbaar = true;

    }


    public void setZichtbaar(boolean setZichtbaar) {
        zichtbaar = setZichtbaar;
        //System.out.println("setZichtbaar = "+zichtbaar);
    }



    public void teken(Graphics g) {
        //System.out.println(zichtbaar);
        if (zichtbaar) {
            g.setColor(this.kleur); //Color.blue // Color.kleur // kleur // this.kleur
            g.fillRect(x, y, breedte, hoogte);
        }


    }



    public void verplaats() {
        // Verander indien nodig van richting
        if( x + dx <= 0 || x + dx + grootte >= 450 )
            dx = -dx;

        if( y + dy <= 0 || y + dy + grootte >= 450 )
            dy = -dy;

        // verander de positie van de bal
        x += dx;  y += dy;
    }

}