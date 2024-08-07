package org.sekiro.chapter1.behavior.fly;

import org.sekiro.chapter1.behavior.interfaces.FlyBehavior;

public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I believe i can fly.");
    }
}
