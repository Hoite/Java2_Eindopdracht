/**
 * Created by hoite on 24-3-17.
 */

//Opstartklasse
public class ReactieGame {

    public static void main(String[] args) {
        ReactieModel model = new ReactieModel();
        ReactieView view = new ReactieView();
        //Speelveld speelveld = new Speelveld();
        ReactieController controller = new ReactieController(view, model);

        view.setVisible(true);
    }
}