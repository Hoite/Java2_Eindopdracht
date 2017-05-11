import java.awt.*;

/**
 * Created by hoite on 11-5-17.
 */
public class Cirkel extends Vorm{
    public void teken(Graphics g) {
        //System.out.println(zichtbaar);
        if (zichtbaar) {
            g.setColor(Color.RED);
            g.fillOval(x, y, w, h);
        }
    }
}
