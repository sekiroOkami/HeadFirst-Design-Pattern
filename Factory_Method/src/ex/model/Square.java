package ex.model;

import ex.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Compute Square Area");
    }
}
