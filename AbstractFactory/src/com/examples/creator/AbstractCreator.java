package com.examples.creator;

import com.examples.interfaces.Car;

public interface AbstractCreator {
    public Car getInstance(int price);
}
