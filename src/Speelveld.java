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

    //private ArrayList<Rechthoek> rechthoeklijst; //lijst met vierkanten

    public Speelveld() {

        rechthoek = new Rechthoek();
        timer.start();
    }

    public Rechthoek getRechthoek() {
        return rechthoek;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        teken(g);
        rechthoek.teken(g);
    }


    class TimerHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            rechthoek.verplaats();
            repaint();
        }
    }

    void teken (Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(1, 1, 455, 455);
    }
}
