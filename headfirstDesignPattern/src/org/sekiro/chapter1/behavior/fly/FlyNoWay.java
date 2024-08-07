package org.sekiro.chapter1.behavior.fly;

import org.sekiro.chapter1.behavior.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I believe i cannot fly.");
    }
}
