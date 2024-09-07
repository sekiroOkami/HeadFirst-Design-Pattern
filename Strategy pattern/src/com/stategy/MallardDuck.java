package com.stategy;

public class MallardDuck implements Duck{
    @Override
    public FlyBehavior getFlyBehavior() {
        return ()-> System.out.println("Mallard is flying");
    }

    @Override
    public QuackBehavior getQuackBehavior() {
        return ()-> System.out.println("Quack");
    }

    @Override
    public void display() {
        System.out.println("I'm a read Mallard duck");
    }

}
