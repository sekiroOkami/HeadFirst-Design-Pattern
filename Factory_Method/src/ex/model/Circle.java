package ex.model;

import ex.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Compute Circle Area");
    }
}
