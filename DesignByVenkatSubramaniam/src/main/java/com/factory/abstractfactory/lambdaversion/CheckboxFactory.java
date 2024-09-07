package com.factory.abstractfactory.lambdaversion;

import com.factory.abstractfactory.Checkbox;

@FunctionalInterface
public interface CheckboxFactory {
    Checkbox create();
}
