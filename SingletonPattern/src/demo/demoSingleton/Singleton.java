package demo.demoSingleton;

public class Singleton {
    private static Singleton uniqueInstance;
    private static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    private Singleton() {
    }
}
