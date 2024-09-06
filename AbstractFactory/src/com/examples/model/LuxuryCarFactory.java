package com.examples.model;

import com.examples.creator.AbstractCreator;
import com.examples.interfaces.Car;

public class LuxuryCarFactory implements AbstractCreator {
    @Override
    public Car getInstance(int price) {
        if (price >= 1_000_000 && price <= 2_000_000) {
            return new LuxuryCar1();
        }
        if (price > 2_000_000) {
            return new LuxuryCar2();
        }
        return null;
    }
}
