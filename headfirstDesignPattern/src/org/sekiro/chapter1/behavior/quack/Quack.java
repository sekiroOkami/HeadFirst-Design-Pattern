package org.sekiro.chapter1.behavior.quack;

import org.sekiro.chapter1.behavior.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
