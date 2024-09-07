package com.factory.abstractfactory;

public class MacCheckbox implements Checkbox{
    @Override
    public void check() {
        System.out.println("Checking a Mac checkbox");
    }
}
