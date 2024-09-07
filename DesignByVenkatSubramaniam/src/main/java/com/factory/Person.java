package com.factory;

// think as interface is a factory
public interface Person {
    Pet getPet(); // we do this instead
    default void play() {
//        private Pet pet; we cannot do this in interface
        System.out.println("Playing with: " + getPet());
    }
}
