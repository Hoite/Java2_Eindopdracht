import java.awt.*;

/**
 * Created by hoite on 11-5-17.
 */
public class Vierkant extends Vorm {

    public Vierkant(Graphics g) {
        super(g);
    }

    @Override
    public void teken(Color kleur) {
        if(kleur == null) {
            kleur = Color.GREEN;
        }
        g.setColor(kleur);
        g.fillRect(x,y,w,h);
    }
}
