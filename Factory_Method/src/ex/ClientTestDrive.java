package ex;

import ex.factory.ConcreteCreator;
import ex.interfaces.Shape;

public class ClientTestDrive {
    public static void main(String[] args) {
        ConcreteCreator creator = new ConcreteCreator();
        Shape shape = creator.getShapeInStance("square");
        shape.computeArea();
    }
}
