package com.factory.abstractfactory;

public class AbstractFactoryWithDefaultMethod {
    public static void main(String[] args) {
        GUIFactory windowFactory = getFactory("windows");
        Button windowButton = windowFactory.createButton();
        Checkbox windowCheckBox = windowFactory.createCheckbox();
        windowCheckBox.check();
        windowButton.paint();
    }

    public static GUIFactory getFactory(String type) {
        return switch (type.toLowerCase()) {
            case "windows" -> new WindowGUIFactory();
            case "mac" -> new MacGUIFactory();
            default -> throw new IllegalArgumentException("Unknow OS type: " + type);
        };
    }
}
