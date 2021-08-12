package com.chu.practicedemo.sort;

import lombok.Builder;

/**
 * @description: 选择排序 O(n2)
 * 选择排序算法
 *  * 在未排序序列中找到最小元素，存放到排序序列的起始位置
 *  * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
 *  * 以此类推，直到所有元素均排序完毕。
 * @author: chufule
 * @time: 2021/3/8 15:25
 */
public class SelectSortDemo {
    public static void SelectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //k为记录最小数所在的下标
            int min = i;
            //从后往前遍历，找出比i小的最小的数值的下标，记录到k中
            for (int j = arr.length-1; j >i; j--) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //交换i和最小的下标的值
            int tem = arr[i];
            arr[i] = arr[min];
            arr[min] = tem;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,5,9,3,4,2,6,1};
        SelectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
