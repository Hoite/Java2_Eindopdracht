/**
 * Created by hoite on 24-3-17.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReactieController {

    private ReactieView view;
    private ReactieModel model;
    private JPanel speelveld;


    public ReactieController(ReactieView view, ReactieModel model) {
    this.view = view;
    this.model = model;
    this.speelveld = view.speelveld;

    this.view.addReactieControllerListener(new ReactieControllerListener());


    }

    class ReactieControllerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if 		(e.getActionCommand() == "Vierkant" ){
                System.out.println("knop Vierkant");
            //    if(klikcorrect) {
                model.setFouten(view.getFoutenTeller());
                view.setLblFoutenTeller(model.getFouten());
            }
            else if (e.getActionCommand() == "Cirkel" ) {
                System.out.println("knop Cirkel");
                model.setScore(view.getScoreTeller());
                view.setLblScoreTeller(model.getScore());
            }
            else if (e.getActionCommand() == "Rechthoek" ){
                System.out.println("knop Rechthoek");
            }
            else if (e.getActionCommand() == "Start" ){
                System.out.println("knop Start");
                speelveld.setZichtbaar(true);
            }
            else if (e.getActionCommand() == "Stop" ){
                System.out.println("knop Stop");

            }
            else if (e.getActionCommand() == "Reset" ){
                System.out.println("knop Reset");
                //stopGame();
                //score = 0;
                //fouten = 0;
                //setScore(score);
                //setFouten(fouten);
            }


        }

    }

}
