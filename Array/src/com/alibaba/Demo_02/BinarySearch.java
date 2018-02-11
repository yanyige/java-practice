package com.alibaba.Demo_02;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("请输入要查找的数组的长度n然后输入n个数据");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[10000];
            for(int i = 0; i < n; i ++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("请输入要查找的数据");
            int key = sc.nextInt();
            int bs = binarySearch(arr, 0, n, key);
            System.out.println("你要查找的数据在第" + bs + "个。请重新输入n继续开始");
        }
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex;

        while(low <= high) {
            int mid = (low + high) >> 1;
            int midVal = a[mid];

            if(midVal < key) {
                low = mid + 1;
            } else if(midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
