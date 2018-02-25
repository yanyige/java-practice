package com.alibaba.Demo_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add("hello");
        l.add("world");
        l.add("java");

        ListIterator lit = l.listIterator();

        while(lit.hasNext()) {
            if(lit.next().equals("java")) {
                lit.add("aaaa");
            }
        }

        System.out.println(l);
    }
}
