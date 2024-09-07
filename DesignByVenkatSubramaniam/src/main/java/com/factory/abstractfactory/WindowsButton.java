package com.factory.abstractfactory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Rendering a windows button");
    }
}
