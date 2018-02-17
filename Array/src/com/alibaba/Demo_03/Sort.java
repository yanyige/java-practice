package com.alibaba.Demo_03;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个需要排序的字符串：");
        while(sc.hasNextLine()) {
            String in = sc.nextLine();
            String[] s= in.split(" ");

            int[] arr = new int[s.length];

            for(int i = 0; i < arr.length; i ++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            Arrays.sort(arr);

            System.out.println("排序后的数组：");
            for(int i = 0; i < arr.length; i ++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
