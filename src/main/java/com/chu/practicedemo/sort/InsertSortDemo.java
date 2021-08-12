package com.chu.practicedemo.sort;

/**
 * @description: 插入排序 O(n'2)
 * 从第一个元素开始，该元素可以认为已经被排序
 *  * 取出下一个元素，在已经排序的元素序列中从后向前扫描
 *  * 如果该元素（已排序）大于新元素，将该元素移到下一位置
 *  * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 *  * 将新元素插入到该位置中
 *  * 重复步骤2
 *
 * @author: chufule
 * @time: 2021/3/8 16:56
 */
public class InsertSortDemo {

    public static void InsertSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9,1,5,6,4,8};
        InsertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

//    public static void main(String args[]) {
//        int i = 7;
//        do {
//            System.out.println(--i);
//            --i;
//        } while (i > 0);
//        System.out.println(i);
//    }
}
