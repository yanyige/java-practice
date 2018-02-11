package com.alibaba.Demo_01;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("请输入要排序的个数n，然后输入n个数");

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int count = 0;
            int[] arr = new int[10000];
            for(int i = 0; i < n; i ++) {
                arr[i] = sc.nextInt();
            }

            bubbleSort(arr, n);

            System.out.println("排序后的结果为：");
            paintArray(arr, n);
            System.out.println("请重新输入");
        }

    }

    public static void paintArray(int[] arr, int n) {
        for(int i = 0; i < n; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr, int n) {
        for(int i = 0; i < n - 1; i ++) {
            for(int j = 0; j < n - i - 1; j ++) {
                if(arr[j + 1] < arr[j]) {
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                }
            }
        }
    }
}
