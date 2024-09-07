package com.stategy;

public class ModelDuck implements Duck{
    @Override
    public FlyBehavior getFlyBehavior() {
        return ()-> System.out.println("Fly no way");
    }

    @Override
    public QuackBehavior getQuackBehavior() {
        return ()-> System.out.println("Silence");
    }

    @Override
    public void display() {
        System.out.println("I'm Model Duck.");
    }
}
