package org.sekiro.chapter1.model;

import org.sekiro.chapter1.behavior.fly.FlyWithWing;
import org.sekiro.chapter1.behavior.interfaces.FlyBehavior;
import org.sekiro.chapter1.behavior.interfaces.QuackBehavior;

public abstract class Duck {
      FlyBehavior flyBehavior;
     QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
}
