package com.alibaba.Demo_02;

public class AnimalDemo {
    public static void main(String[] args) {
        Factory f = new DogFactory();
        Animal d = f.createAnimal();
        d.eat();
        System.out.println("-------");
        f = new CatFactory();
        Animal c = f.createAnimal();
        c.eat();
    }
}
