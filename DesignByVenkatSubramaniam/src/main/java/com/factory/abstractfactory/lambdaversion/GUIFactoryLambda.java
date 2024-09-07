package com.factory.abstractfactory.lambdaversion;

import com.factory.abstractfactory.*;

public interface GUIFactoryLambda {
    default Button createButton() {
        return new WindowsButton();
    }

    default Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    //Factory method accepting lambda expression for customization
    static GUIFactoryLambda create(ButtonFactory buttonFactory, CheckboxFactory checkboxFactory) {
        return new GUIFactoryLambda() {
            @Override
            public Button createButton() {
                return buttonFactory.create();
            }

            @Override
            public Checkbox createCheckbox() {
                return checkboxFactory.create();
            }
        };
    }

}
