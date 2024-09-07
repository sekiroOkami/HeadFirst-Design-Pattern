package demo.demoSingleton.synchronize;

/**
 * this approach is very expensive
 * thread1 --> call --> lock --> null --> return --> Cat
 * thread2 --> call --> lock --> return --> Cat
 * thread3 --> call --> lock --> return --> Cat
 * locking is very expensive because very time this method invoke it get lock every time
 */
public class Cat {
    private static Cat cat;
    private Cat(){}

    synchronized public static Cat getInstance() {
        if (cat==null) {
            cat=new Cat();
        }
        return cat;
    }
}
