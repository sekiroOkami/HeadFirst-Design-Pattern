package com.factory;

public class CatLover implements Person{
    private Cat cat = new Cat();
    @Override
    public Pet getPet() {
        return cat;
    }
}
