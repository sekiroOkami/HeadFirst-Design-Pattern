package com.factory.abstractfactory.lambdaversion;

import com.factory.abstractfactory.Button;

@FunctionalInterface
public interface ButtonFactory {
    Button create();
}
