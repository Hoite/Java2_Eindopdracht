/**
 * Created by hoite on 24-3-17.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReactieView extends JFrame {

    public JPanel speelveld = new Speelveld();

    private JLabel lblScore = new JLabel("Score: ");
    private JLabel lblScoreTeller = new JLabel("0");
    private JLabel lblFouten = new JLabel("Fouten: ");
    private JLabel lblFoutenTeller = new JLabel("0");
    private JButton btvierkant = new JButton("Vierkant");
    private JButton btcirkel = new JButton("Cirkel");
    private JButton btrechthoek = new JButton("Rechthoek");
    private JButton btstart = new JButton("Start");
    private JButton btstop = new JButton("Stop");
    private JButton btreset = new JButton("Reset");

    public ReactieView() {
        JPanel knoppen = new JPanel(new GridLayout(0,3));
        //JPanel game = new JPanel(new BorderLayout());
        JPanel scoreOverzicht = new JPanel(new GridLayout(4,2));
        //JPanel speelveld = new Speelveld();

        this.setSize(600, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ReactieGame");

        //Knoppen en labels toevoegen op de juiste plaats(knoppen,labels);
        scoreOverzicht.add(lblScore);
        scoreOverzicht.add(lblScoreTeller);
        scoreOverzicht.add(lblFouten);
        scoreOverzicht.add(lblFoutenTeller);
        knoppen.add(btvierkant);
        knoppen.add(btcirkel);
        knoppen.add(btrechthoek);
        scoreOverzicht.add(btstart);
        scoreOverzicht.add(btstop);
        scoreOverzicht.add(btreset);

        btvierkant.	setBounds(10,10,80,20);
        btcirkel.	setBounds(10,10,80,20);
        btrechthoek.setBounds(10,10,80,20);

        this.add(knoppen, BorderLayout.SOUTH);
        this.add(speelveld, BorderLayout.CENTER);
        this.add(scoreOverzicht, BorderLayout.EAST);


    }

    void addReactieControllerListener (ActionListener listenForAnyButton) {
        btstart.addActionListener(listenForAnyButton);
        btcirkel.addActionListener(listenForAnyButton);
        btrechthoek.addActionListener(listenForAnyButton);
        btreset.addActionListener(listenForAnyButton);
        btstop.addActionListener(listenForAnyButton);
        btvierkant.addActionListener(listenForAnyButton);
    }

    public int getFoutenTeller() {
        return Integer.parseInt(lblFoutenTeller.getText());
    }

    public int getScoreTeller() {
        return Integer.parseInt(lblScoreTeller.getText());
    }

    public void setLblFoutenTeller(int foutenAantal) {
        this.lblFoutenTeller.setText(String.valueOf(foutenAantal));
    }

    public void setLblScoreTeller(int scoreAantal) {
        this.lblScoreTeller.setText(String.valueOf(scoreAantal));
    }
}
