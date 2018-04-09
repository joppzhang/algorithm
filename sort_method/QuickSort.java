package com.zpq;

import java.util.Arrays;

/**
 * @author peiqingzhang
 * @version 1.0
 * Õâ¸ö°æ±¾ÓĞÎÊÌâ£¬²¿ìÅÅÓĞºÜ¶àÊµÊµÏÖ·½Ê½£¬ÕâÀïµÄÊÇÇ°ºóÖ¸Õë½»»»£¬µ«ÊÇÃ»ÓĞÑÏ¸ñ°´ÕÕÔ­ÉúµÄµÄ¿ìÅÅË¼ÏëÈ¥×ö¡£Ô­ÉúÓ¦¸ÃÊÇ´ÓºóÉ¨ÃèÓöµ½±ÈkeyĞ¡µÄ£¬´ÓÇ°É¨Ãè£¬Óöµ½±Èkey´óµÄ£¬ÁÁ½¸ö½»»»£¬ÖÖ±µ½Ç°ºóÏàµÈ£¬ºÍkey½»»»¡£ÕâÑùµÄĞ§ÂÊ¸ß
 * å¿«é€Ÿæ’åºçš„é€’å½’ç‰ˆæœ¬
 * å¿«æ‹çš„å®ç°æ–¹æ³•æœ‰ä¸åŒçš„ç±»å‹ï¼Œé€‰ç”¨éšæœºè½´å¯ä»¥å¤§å¹…åº¦ä¼˜åŒ–æ€§èƒ½
 */
public class QuickSort {
    public static void main(String[] args){
        int[] arr = {12,5,65,76,45,86,34};
        int[] result = quickSort(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] quickSort(int[] arr) {
        if(arr == null || arr.length == 0){
            System.out.println("é”™è¯¯çš„è¾“å…¥æ•°ç»„");
            return null;
        }
        return quickSortArray(arr,0,arr.length);
    }

    private static int[] quickSortArray(int[] arr, int i, int length) {
        int key = arr[i];
        int p;
        int q;
        int x=0;
        if (length-i <= 1){//å¦‚æœæ˜¯0 æˆ–è€… null å°±ä¸ç”¨é€’å½’è°ƒç”¨äº†ã€‚
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
