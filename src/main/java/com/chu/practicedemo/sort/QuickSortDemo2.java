package com.chu.practicedemo.sort;

import java.util.Arrays;

public class QuickSortDemo2 {
    public static void main(String[] args) {
        int[] arr = {8,4,9,6,2,1,3};
//        int[] arr = {3,1,4,6,8,5,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr,int l,int r){
        while (l >= r){
            return;
        }
        int guard = arr[l];
        int i = l;
        int j = r;
        while (i<j) {

            //先从右往左，找到比guard小的数，如果arr[j]>=guard则j--
            while (arr[j]>=guard && i<j){
                j--;
            }
            //从左往右，找到比guard大的数，如果arr[i]<=guard则i++
            while (arr[i]<=guard && i<j){
                i++;
            }
            if (i<j ){
                swap(arr,i,j);
            }
        }
        swap(arr,l,i);
        sort(arr,l,i-1);
        sort(arr,i+1,r);
    }

    private static void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
