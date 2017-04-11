import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by hoite on 4-4-17.
 */
public class Speelveld extends JPanel {
    public Timer timer = new Timer(100, new TimerHandler());

    //private nogmeervormen nogmeervormen;
    private Rechthoek rechthoek;

    //private ArrayList<Rechthoek> rechthoeklijst; //lijst met vierkanten

    public Speelveld() {

        rechthoek = new Rechthoek(Color.black, 10,10,10,10);


        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        teken(g);
        rechthoek.teken(g);
    }

    public void setZichtbaar(boolean setZichtbaar) {

        rechthoek.setZichtbaar(setZichtbaar);
    }

    class TimerHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            rechthoek.verplaats();
            repaint();
        }
    }

    void teken (Graphics g) {
        g.setColor(Color.green);
        g.fillRect(1, 1, 455, 455);
    }
}
