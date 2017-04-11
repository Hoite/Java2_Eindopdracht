/**
 * Created by hoite on 11-4-17.
 */


import java.awt.Color;
import java.awt.Graphics;

public class Vorm {

    public int x = (int) (450 * Math.random() + 50);
    public int y = (int) (450 * Math.random() + 50);
    public int w = 30;
    public int h = 30;
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


        if (x +dx <= 50 || x + dx + 10 >= 450 )
            dx = -dx;
        if ( y + dy <= 50 || y + dy + 10 >= 450)
            dy = -dy;

        x += dx; y += dy;
    }


}
