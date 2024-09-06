package demo.demoSingleton.eager;

public class Dog {
    // this will be initialized everytime Dog class loaded
    private static Dog dog = new Dog();
    private static Dog getInstance() {
        return dog;
    }
}
