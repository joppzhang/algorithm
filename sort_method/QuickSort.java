package com.zpq;

import java.util.Arrays;

/**
 * @author peiqingzhang
 * @version 1.0
 *
 * 快速排序的递归版本
 *
 */
public class QuickSort {
    public static void main(String[] args){
        int[] arr = {12,5,65,76,45,86,34};
        int[] result = quickSort(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] quickSort(int[] arr) {
        if(arr == null || arr.length == 0){
            System.out.println("错误的输入数组");
            return null;
        }
        return quickSortArray(arr,0,arr.length);
    }

    private static int[] quickSortArray(int[] arr, int i, int length) {
        int key = arr[i];
        int p;
        int q;
        int x=0;
        if (length-i <= 1){//如果是0 或者 null 就不用递归调用了。
            return arr;
        }else{
            p = i+1;
            q = length-1;
            while(p <= q){
                if(p == q){
                    x=p;
                }
                if(arr[p] > key){
                    int t;
                    t = arr[q];
                    arr[q] = arr[p];
                    arr[p] = t;
                    q--;
                }else {
                    p++;
                }
            }
            if(p>x){
                int tmp = arr[i];
                arr[i] = arr[x];
                arr[x] = tmp;
            }else{
                int tmp = arr[i];
                arr[i] = arr[q];
                arr[q] = tmp;
                x=q;
            }
            quickSortArray(arr,i,x);
            quickSortArray(arr,x+1,length);
            return arr;
        }
    }
}
