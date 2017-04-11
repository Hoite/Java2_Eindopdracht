/**
 * Created by hoite on 24-3-17.
 */
public class ReactieGame { //Opstartklasse

    public static void main(String[] args) {
        ReactieModel model = new ReactieModel();
        ReactieView view = new ReactieView();
        //Speelveld speelveld = new Speelveld();
        ReactieController controller = new ReactieController(view, model);

        view.setVisible(true);
    }
}


//Aanroepen:
//
//Model - de regels van het spel (de logica)
//View - aanroepen ballen en vormen
//Controller - knoppen en knophandlers