/**
 * Created by hoite on 24-3-17.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReactieController {

    private ReactieView view;
    private ReactieModel model;



    public ReactieController(ReactieView view, ReactieModel model) {
    this.view = view;
    this.model = model;

    this.view.addReactieControllerListener(new ReactieControllerListener());


    }

    // functie om score / fouten op te hogen
    public void vormGeklikt(boolean klik) {
        if (klik) {
            //Score +1
            model.setScore(view.getScoreTeller() + 1);
            view.setLblScoreTeller(model.getScore());
        }
        else {
            //Fouten +1
            model.setFouten(view.getFoutenTeller() + 1);
            view.setLblFoutenTeller(model.getFouten());
        }
    }

    class ReactieControllerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if 		(e.getActionCommand() == "Vierkant" ){
                System.out.println("knop Vierkant");
            }

            else if (e.getActionCommand() == "Cirkel" ) {
                System.out.println("knop Cirkel");
            }

            else if (e.getActionCommand() == "Rechthoek" ){
                System.out.println("knop Rechthoek");
                Rechthoek rh = view.speelveld.getRechthoek();
                if (rh.getZichtbaar()) {
                    System.out.println("rechthoek is zichtbaar");
                    vormGeklikt(true);
                }
                else {
                    System.out.println("rechthoek is niet zichtbaar");
                    vormGeklikt(false);
                }
            }

            else if (e.getActionCommand() == "Start" ){
                System.out.println("knop Start");
                Rechthoek rh = view.speelveld.getRechthoek();
                rh.setZichtbaar(true);

            }

            else if (e.getActionCommand() == "Stop" ){
                System.out.println("knop Stop");
                Rechthoek rh = view.speelveld.getRechthoek();
                rh.setZichtbaar(false);

            }

            else if (e.getActionCommand() == "Reset" ) {
                System.out.println("knop Reset");
                model.setScore(0);
                model.setFouten(0);
                view.setLblScoreTeller(0);
                view.setLblFoutenTeller(0);

                Rechthoek rh = view.speelveld.getRechthoek();
                rh.setZichtbaar(false);

            }


        }

    }

}
