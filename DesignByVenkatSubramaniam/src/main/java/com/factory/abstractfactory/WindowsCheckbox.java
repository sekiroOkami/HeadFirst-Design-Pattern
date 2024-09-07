package com.factory.abstractfactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void check() {
        System.out.println("Checking a Windows Checkbox");
    }
}
