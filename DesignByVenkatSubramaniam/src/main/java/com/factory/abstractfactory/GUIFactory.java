package com.factory.abstractfactory;

public interface GUIFactory {
    default Button createButton() {
        throw new UnsupportedOperationException("This method should be override by the concrete factory");
    }

    default Checkbox createCheckbox() {
        throw new UnsupportedOperationException("This method should be override by the concrete factory");
    }
}
