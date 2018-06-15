package com.alibaba.Demo_01;

public class AnimalFactory1 {
    private AnimalFactory1() {

    }

    public static Animal createAnimal(String type) {
        if(type.equals("cat")) {
            return new Cat();
        }
        if(type.equals("dog")) {
            return new Dog();
        }
        return null;
    }
}
