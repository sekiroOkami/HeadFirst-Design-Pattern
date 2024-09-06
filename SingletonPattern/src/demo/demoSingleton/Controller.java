package demo.demoSingleton;

public class Controller {
    private static final Controller INSTANCE = new Controller();
    private Controller() {

    }

    public static Controller getInstance() {
        return INSTANCE;
    }

    public void start() {

    }
}
