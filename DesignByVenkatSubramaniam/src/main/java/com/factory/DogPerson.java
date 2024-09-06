package com.factory;

public class DogPerson implements Person{
    private Dog dog = new Dog();
    public Pet getPet() {
        return dog;
    }
}
