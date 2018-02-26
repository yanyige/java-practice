package com.alibaba.Demo_03;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo_03 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add("hello");
        arr.add("world");
        arr.add("java");
        arr.add("hello");
        arr.add("world");
        arr.add("java");
        arr.add("hello");
        arr.add("world");
        arr.add("java");

        System.out.println(arr);

        ArrayList uniqueArr = new ArrayList();
        ListIterator lit = arr.listIterator();
        while(lit.hasNext()) {
            String str = (String)lit.next();

            if(!uniqueArr.contains(str)) {
                uniqueArr.add(str);
            }
        }

        while(lit.hasNext()) {
            String str = (String)lit.next();

            System.out.println(str);
        }
        System.out.println(uniqueArr);
    }
}
