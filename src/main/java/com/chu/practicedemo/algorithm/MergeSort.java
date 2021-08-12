package com.chu.practicedemo.algorithm;

import java.util.Arrays;

/**
 * @ClassName MergeSort
 * @Description 归并排序
 * @Author chufule
 * @Date 2021/5/27 11:38
 * @Version 1.0
 */
public class MergeSort {

    public static void solution(int[] arr){
        if (arr.length <= 1) {
            return;
        }
        sort(arr,0, arr.length-1);
    }

    public static void sort(int[] arr,int L,int R){
        if (L == R) {
            return;
        }
        int mid = L+((R - L) >> 1);
        sort(arr,0,mid);
        sort(arr,mid+1,R);
        merge(arr,L,mid,R);
    }

    public static void merge(int[] arr,int L,int M,int R){
        int length = (R-L) + 1;
        int[] help = new int[length];
        int l = L;
        int r = M+1;
        int i = 0;
        while (l <= M && r <= R) {
            help[i++] = arr[l] <= arr[r] ? arr[l++] : arr[r++];
        }
        while (l <= M) {
            help[i++] = arr[l++];
        }
        while (r <= R) {
            help[i++] = arr[r++];
        }
        for (int i1 : help) {
            arr[L++] = i1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,2,3,1,4,5,6};
        solution(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
