package com.alibaba.Demo_01;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        c.eat();
        System.out.println("--------");

        AnimalFactory.createCat().eat();
        AnimalFactory.createDog().eat();
        System.out.println("--------");

        AnimalFactory1.createAnimal("dog").eat();
        AnimalFactory1.createAnimal("cat").eat();

    }
}
