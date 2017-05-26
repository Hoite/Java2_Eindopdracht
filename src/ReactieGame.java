/**
 * Created by hoite on 24-3-17.
 * Startklassen met Main, maakt Model + View + Controller aan
 */

//Opstartklasse
public class ReactieGame {

    public static void main(String[] args) {
        ReactieModel model = new ReactieModel();
        ReactieView view = new ReactieView();
        ReactieController controller = new ReactieController(view, model);

        view.setVisible(true);
    }
}