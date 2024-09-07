package com.examples.model;

import com.examples.creator.AbstractCreator;
import com.examples.interfaces.Car;

public class EconomicCarFactory implements AbstractCreator {
    @Override
    public Car getInstance(int price) {
        if (price <= 300000) {
            return new EconomicCar1();
        }
        else if(price > 300000) {
            return new EconomicCar2();
        }
        return null;
    }
}
