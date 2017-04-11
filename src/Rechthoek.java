import java.awt.*;

/**
 * Created by hoite on 4-4-17.
 */

public class Rechthoek extends Vorm {


    public void teken(Graphics g) {
        //System.out.println(zichtbaar);
        if (zichtbaar) {
            g.setColor(Color.PINK);
            g.fillRect(x, y, w, h);
        }


    }

}