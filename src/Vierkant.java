import java.awt.*;

/**
 * Created by hoite on 11-5-17.
 */
public class Vierkant extends Vorm {
    public void teken(Graphics g) {
        //System.out.println(zichtbaar);
        if (zichtbaar) {
            g.setColor(Color.GREEN);
            g.fillRect(x, y, w, h);
        }
    }
}
