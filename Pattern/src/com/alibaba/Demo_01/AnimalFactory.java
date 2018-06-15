package com.alibaba.Demo_01;

public class AnimalFactory {

    private AnimalFactory() {

    }

    public static Dog createDog() {
        return new Dog();
    }

    public static Cat createCat() {
        return new Cat();
    }
}
