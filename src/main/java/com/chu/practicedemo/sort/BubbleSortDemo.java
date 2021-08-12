package com.chu.practicedemo.sort;

/**
 * @description: 冒泡排序 O(n'2)
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 *  * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 *  * 针对所有的元素重复以上的步骤，除了最后一个。
 *  * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
 *
 * 作者：shadow000902
 * 链接：https://www.jianshu.com/p/8c915179fd02
 * 来源：简书
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @author: chufule
 * @time: 2021/3/8 14:22
 */
public class BubbleSortDemo {

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1- i; j++) {
                if (arr[j]>arr[j+1]) {
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,5,9,3,4,2,6,1};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

