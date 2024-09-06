package ex.factory;

import ex.interfaces.Shape;
import ex.model.Circle;
import ex.model.Square;

public class ConcreteCreator implements Creator{
    public Shape getShapeInStance(String type) {
        if (type.equals("circle".toLowerCase())) {
            return new Circle();
        }
        else if (type.equals("square".toLowerCase())) {
            return new Square();
        }
        return null;
    }
}
