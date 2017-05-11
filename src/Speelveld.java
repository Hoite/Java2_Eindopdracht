import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by hoite on 4-4-17.
 */
public class Speelveld extends JPanel {
    public Timer timer = new Timer(50, new TimerHandler());

    //private nogmeervormen nogmeervormen;
    private Rechthoek rechthoek;
    private Cirkel cirkel;
    private Vierkant vierkant;

    //private ArrayList<Rechthoek> rechthoeklijst; //lijst met vierkanten

    public Speelveld() {
        //aanmaken vormen
        rechthoek = new Rechthoek();
        cirkel = new Cirkel();
        vierkant = new Vierkant();
        //starten timer
        timer.start();
    }

    //getters voor de vormen
    public Rechthoek getRechthoek() {
        return rechthoek;
    }
    public Cirkel getCirkel() {return cirkel;}
    public Vierkant getVierkant() {return vierkant;}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        teken(g);
        rechthoek.teken(g);
        cirkel.teken(g);
        vierkant.teken(g);
    }


    class TimerHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            rechthoek.verplaats();
            cirkel.verplaats();
            vierkant.verplaats();
            repaint();
        }
    }

    //Tekenen van het tekenveld
    void teken (Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(1, 1, 455, 455);
    }
}
