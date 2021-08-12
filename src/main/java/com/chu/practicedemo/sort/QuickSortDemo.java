package com.chu.practicedemo.sort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @description: 快速排序 nlogn
 * @author: chufule
 * @time: 2021/3/5 18:18
 */
public class QuickSortDemo {

    public static void quickSort1(int[] arr,int low,int high){
        while (low>=high){
            return;
        }
        int i = low;
        int j = high;
        int guard = arr[low];
        while (i<j) {
            while (guard<=arr[j] && i<j) {
                j--;
            }
            while (guard>=arr[i] && i<j) {
                i++;
            }
            if (i<j) {
                swap(arr, i, j);
            }
        }
        swap(arr,low,i);
        quickSort1(arr,low,j-1);
        quickSort1(arr,j+1,high);

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
//
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减 找到比初始位置小的数值位置
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增 找到比初始位置大的数据
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换 i和j位置数据
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
            //继续j往左  i往右 直到 i=j时
        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }




    public static void main(String[] args) {
//        int[] arr = new int[]{9,1,5,6,4,8};
//        int[] arr = new int[]{6 ,1, 2, 7, 9, 11, 4, 5, 10, 8};

        int[] arr = {8,6,4,9,6,2,1,6,3};
        quickSort1(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
