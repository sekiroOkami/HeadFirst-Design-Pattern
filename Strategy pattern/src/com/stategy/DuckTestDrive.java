package com.stategy;

public class DuckTestDrive {
    public static void main(String[] args) {
//        mallard();
        modelDuck();
    }
    private static void modelDuck() {
        Duck model = new ModelDuck();
        model.getQuackBehavior().quack();
        model.getFlyBehavior().fly();
        model.display();
    }

    private static void mallard() {
        Duck mallard = new MallardDuck();
        mallard.getQuackBehavior().quack();
        mallard.getFlyBehavior().fly();
        mallard.display();
    }
}
