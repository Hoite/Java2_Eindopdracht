import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by hoite on 4-4-17.
 */
public class Speelveld extends JPanel {

    //Aanmaken vormen naar variabelen
    private Rechthoek rechthoek;
    private Cirkel cirkel;
    private Vierkant vierkant;

    //Aanmaken array met vormen in threads
    Thread[] vormenArray = new Thread[4];
    private int randomwaarde;
    boolean running;

    private int min = 1000;
    private int max = 1000;

    Random randomTime;
    int randomTimeOutput;
    Timer timerRunAction;



    public Speelveld() {
        //RandomTimer
        randomTime = new Random();
        randomTimeOutput = (min + randomTime.nextInt(max - min +1));
        timerRunAction = new Timer(randomTimeOutput, new RandomObjecten());

    }



    public void getStatus() {
        System.out.println(vormenArray[1].isAlive());
        System.out.println(vormenArray[2].isAlive());
    }

    public boolean getCirkelStatus() {
        return vormenArray[1].isAlive();
    }

    public boolean getRechthoekStatus() {
        return vormenArray[3].isAlive();
    }

    public boolean getVierkantStatus() {
        return vormenArray[2].isAlive();
    }

    public void startSpel() {
        //start animatie

        if(running == false) {
            initializeVormen();

            timerRunAction.start();
            running = true;
        }
    }

    public void initializeVormen() {
        if(running == false) {
            vormenArray[1] = new Cirkel(getGraphics());
            vormenArray[2] = new Vierkant(getGraphics());
            vormenArray[3] = new Rechthoek(getGraphics());
            running = true;
        }
    }

    public void randomObject() {
        randomN();
        int h = randomwaarde;

        System.out.println(h);

        if (h == 1 && !vormenArray[1].isAlive()) {
            vormenArray[1].start();

        } else if (h == 2 && !vormenArray[2].isAlive()) {
            vormenArray[2].start();

        } else if (h == 3 && !vormenArray[3].isAlive()) {
            vormenArray[3].start();
        }
    }

    public int randomN() {
        randomwaarde = (int) (3 * Math.random() +1);
        return randomwaarde;
    }

    public void stopCirkel() {
        ((Vorm) vormenArray[1]).nuStoppen();
        repaint();
        try {
            vormenArray[1].join();
        }
        catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        vormenArray[1] = new Cirkel(getGraphics());
    }

    public void stopVierkant() {
        ((Vorm) vormenArray[2]).nuStoppen();
        repaint();
        try{
            vormenArray[2].join();
        }
        catch (InterruptedException e1){
            e1.printStackTrace();
        }
        vormenArray[2] = new Vierkant(getGraphics());
    }

    public void stopRechthoek() {
        ((Vorm) vormenArray[3]).nuStoppen();
        repaint();
        try{
            vormenArray[3].join();
        }
        catch (InterruptedException e1){
            e1.printStackTrace();
        }
        vormenArray[3] = new Rechthoek(getGraphics());
    }

    public void stopSpel() {
        //stop animatie
        for (int j = 1; j < 4; j++) {
            ((Vorm)vormenArray[j]).nuStoppen();
            repaint();
            try {
                vormenArray[j].join();
            }
            catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        running = false;
        timerRunAction.stop();
    }

    class RandomObjecten implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            initializeVormen();
            randomObject();
        }
    }

    //getters voor de vormen
    public Rechthoek getRechthoek() { return rechthoek; }
    public Cirkel getCirkel() { return cirkel; }
    public Vierkant getVierkant() { return vierkant; }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        teken(g);
    }

    //Tekenen van het tekenveld
    void teken (Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(1, 1, 455, 455);
    }
}
