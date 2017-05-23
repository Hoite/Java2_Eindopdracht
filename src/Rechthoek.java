import java.awt.*;

/**
 * Created by hoite on 4-4-17.
 */

public class Rechthoek extends Vorm {

    public Color kleur = Color.BLUE;

    public Rechthoek(Graphics g) {
        super(g);
    }

    @Override
    public void teken(Color kleur) {
        if(kleur == null) {
            kleur = Color.BLUE;
        }
        g.setColor(kleur);
        g.fillRect(x,y,w*3,h);
    }
}