package com.alibaba.Demo_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");

        c.remove("java");

        System.out.println("c:" + c);

    }
}
