package com.chu.practicedemo.sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSortDemo3 {
    public static void main(String[] args) {
        int[] arr = {8,4,9,6,2,1,3};
//        int[] arr = {3,1,4,6,8,5,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr,int L,int R){
        if (arr == null || arr.length <= 1) {
            return;
        }
        if (L >= R) {
            return;
        }
        int[] partition = partition(arr, L, R);
        sort(arr,L,partition[0]-1);
        sort(arr,partition[1]+1,R );
    }

    public static int[] partition(int[] arr,int L,int R){
        int randomIndex = new Random().nextInt(R) % (R-L+1) + L;
        swap(arr,randomIndex,R);
        int keyValue = arr[R];
        int lessL = L-1;
        int moreR = R;
        int cur = L;
        while (cur < moreR) {
            if (arr[cur] < keyValue) {
                swap(arr,cur++,++lessL);
            }else if (arr[cur] > keyValue) {
                swap(arr,cur,--moreR);
            } else {
                cur++;
            }
        }
        swap(arr,moreR,R);
        return new int[]{lessL+1,moreR};
    }

    private static void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
