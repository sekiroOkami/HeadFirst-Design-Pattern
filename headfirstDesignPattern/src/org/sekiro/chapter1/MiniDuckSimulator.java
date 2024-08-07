package org.sekiro.chapter1;

import org.sekiro.chapter1.model.Duck;
import org.sekiro.chapter1.model.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();
    }
}
