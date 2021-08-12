package com.chu.practicedemo.algorithm;

import java.util.Arrays;

/**
 * @ClassName Heap
 * @Description TODO
 * @Author chufule
 * @Date 2021/5/28 16:39
 * @Version 1.0
 */
public class Heap {
    private int heapSize;
    private int[] arr;

    public boolean isEmpty(){
        return heapSize <= 0;
    }

    public Heap(int[] arr) {
        this.arr = arr;
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr,i);
        }
        this.heapSize = arr.length ;
    }

    public  int pop(){
        if (arr == null || heapSize <= 0) {
            throw new IndexOutOfBoundsException("堆中无数据");
        }
        int largest = arr[0];
        swap(arr,0,--heapSize);
        heapIfy(arr,0,heapSize);
        return largest;
    }
    //往堆中添加元素，向上比对
    public static void heapInsert(int[] arr,int index){
        while (arr[index] > arr[(index -1) / 2]) {
            swap(arr,index,(index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    //堆向下比对
    public static void heapIfy(int[] arr,int index,int heapSize){
        int sonLeft = index * 2 + 1;
        while ( sonLeft < heapSize) {
            //找到左右子孩子中较大的数的位置
            int largest = (sonLeft + 1) < heapSize && arr[sonLeft] < arr[sonLeft + 1] ? sonLeft + 1 : sonLeft ;
            //比较index和较大位置largest的值大小
            if (arr[index] < arr[largest]) {
                swap(arr,index,largest);
                index = largest;
                sonLeft = index * 2 + 1;
            }else {
                break;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapSort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr,i);
        }
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while (heapSize > 0) {
            heapIfy(arr,0, heapSize);
            swap(arr, 0, --heapSize);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2};
//        Heap heap = new Heap(arr);
//        System.out.println(Arrays.toString(heap.arr));
//        while (!heap.isEmpty()) {
//            System.out.println(heap.pop());
//        }
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
