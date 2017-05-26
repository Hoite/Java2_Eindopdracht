import java.awt.*;

/**
 * Created by hoite on 11-5-17.
 */

/**
 * Class voor de vorm Cirkel
 */
public class Cirkel extends Vorm{
    public Cirkel(Graphics g) {
        super(g);
    }

    @Override
    public void teken(Color kleur) {
        if  (kleur == null){
            kleur = Color.RED;
        }
        g.setColor(kleur);
        g.fillOval(x, y, w, h);
    }


}
