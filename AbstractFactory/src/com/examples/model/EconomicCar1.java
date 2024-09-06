package com.examples.model;

import com.examples.interfaces.Car;

public class EconomicCar1 implements Car {
    @Override
    public int getTopSpeed() {
        return 100;
    }
}
