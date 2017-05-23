/**
 * Created by hoite on 24-3-17.
 */

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

    public void klikGoed() {
        //Score +1
        model.setScore(view.getScoreTeller() + 1);
        view.setLblScoreTeller(model.getScore());
    }

    public void klikFout() {
        //Fouten +1
        model.setFouten(view.getFoutenTeller() + 1);
        view.setLblFoutenTeller(model.getFouten());
    }




    // functie om score / fouten op te hogen
    public void vormGeklikt(String welkeVorm) {
        //welkeVorm kan vierkant, rechthoek of cirkel zijn

        //rechthoek getten in variabele
        Rechthoek rh = view.speelveld.getRechthoek();

        //cirkel getten in variabele
        Cirkel ck = view.speelveld.getCirkel();

        //vierkant getten in variabele
        Vierkant vk = view.speelveld.getVierkant();

        if (welkeVorm == "vierkant") {
            //als vierkant is geklikt
            if(view.speelveld.getVierkantStatus()){
                klikGoed();
                view.speelveld.stopVierkant();
            }
            else {
                System.out.println("vierkant is niet zichtbaar");
                klikFout();
            }
        }

        else if (welkeVorm == "rechthoek") {
            //als rechthoek is geklikt
            if (view.speelveld.getRechthoekStatus()) {
                klikGoed();
                view.speelveld.stopRechthoek();
            }
            else {
                System.out.println("rechthoek is niet zichtbaar");
                klikFout();
            }
        }
        else if (welkeVorm == "cirkel") {
            //als cirkel is geklikt
            if (view.speelveld.getCirkelStatus()) {
                klikGoed();
                //cirkelweg
                view.speelveld.stopCirkel();
            }
            else {
                klikFout();
            }
        }
    }

    class ReactieControllerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if 		(e.getActionCommand() == "Vierkant" ){
                System.out.println("knop Vierkant");
                vormGeklikt("vierkant");
            }

            else if (e.getActionCommand() == "Cirkel" ) {
                System.out.println("knop Cirkel");
                vormGeklikt("cirkel");
            }

            else if (e.getActionCommand() == "Rechthoek" ){
                System.out.println("knop Rechthoek");
                vormGeklikt("rechthoek");
            }

            else if (e.getActionCommand() == "Start" ){
                System.out.println("knop Start");
                view.speelveld.startSpel();
            }

            else if (e.getActionCommand() == "Stop" ){
                System.out.println("knop Stop");
                view.speelveld.stopSpel();
            }

            else if (e.getActionCommand() == "Reset" ) {
                System.out.println("knop Reset");
                //Scores en labels op nul
                model.setScore(0);
                model.setFouten(0);
                view.setLblScoreTeller(0);
                view.setLblFoutenTeller(0);
            }
        }
    }
}
