package com.alibaba.Demo_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        System.out.println("请输入要统计的字符串：");
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
        while(sc.hasNextLine()) {
            String in = sc.nextLine();
            char[] inChar = in.toCharArray();
            for(char c : inChar) {
//                System.out.println(c);
                if(hm.get(c) == null) {
                    hm.put(c, 1);
                } else {
                    hm.put(c, hm.get(c) + 1);
                }
            }

            Set<Map.Entry<Character, Integer>> me = hm.entrySet();
            for(Map.Entry<Character, Integer> m : me) {
                System.out.println(m.getKey() + "字符出现" + m.getValue() + "次");
            }
            System.out.println("请输入要统计的字符串：");
            hm.clear();
        }
    }
}
