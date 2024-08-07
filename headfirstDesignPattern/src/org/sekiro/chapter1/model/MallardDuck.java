package org.sekiro.chapter1.model;

import org.sekiro.chapter1.behavior.fly.FlyWithWing;
import org.sekiro.chapter1.behavior.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
    }

    @Override
    public void display() {
        System.out.println("Im a MallardDuck.");
    }
}
