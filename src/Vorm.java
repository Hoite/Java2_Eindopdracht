/**
 * Created by hoite on 11-4-17.
 */


import java.awt.Color;
import java.awt.Graphics;

public class Vorm {
//hier komen threads
    public int x = (int) (400 * Math.random() + 25);
    public int y = (int) (400 * Math.random() + 25);
    public int w = 20;
    public int h = 20;
    public int dx = 3, dy = 2;
    public boolean zichtbaar;


    public Vorm(){

        this.zichtbaar = false;
    }

    public boolean getZichtbaar(){
        return zichtbaar;
    }

    public void setZichtbaar(boolean zichtbaar){
        this.zichtbaar = zichtbaar;
    }

    public void verplaats(){


        if (x +dx <= 1 || x + dx + 25 >= 450 )
            dx = -dx;
        if ( y + dy <= 1 || y + dy + 25 >= 450)
            dy = -dy;

        x += dx; y += dy;
    }


}
