package com.alibaba.Demo_02;

public class CatFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
