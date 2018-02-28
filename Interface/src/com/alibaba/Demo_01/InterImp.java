package com.alibaba.Demo_01;

public class InterImp<T> implements Inter<T> {
    public void show(T t) {
        System.out.println(t);
    }
}
