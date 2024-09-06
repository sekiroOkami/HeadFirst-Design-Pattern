package com.examples;

import com.examples.creator.AbstractCreator;
import com.examples.creator.AbstractFactoryProducer;
import com.examples.interfaces.Car;

public class ClientTestDrive {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractCreator abstractCreator = abstractFactoryProducer.getFactoryInstance("Economic");
        Car car = abstractCreator.getInstance(1_000_000);
        System.out.println("car.getTopSpeed() = " + car.getTopSpeed());
    }
}
