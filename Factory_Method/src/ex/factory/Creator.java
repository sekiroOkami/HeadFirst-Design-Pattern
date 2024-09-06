package ex.factory;

import ex.interfaces.Shape;

public interface Creator {
    Shape getShapeInStance(String type);
}
