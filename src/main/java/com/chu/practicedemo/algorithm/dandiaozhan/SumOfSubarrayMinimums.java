package com.chu.practicedemo.algorithm.dandiaozhan;

import java.util.Stack;

/**
 *
 * @ClassName SumOfSubarrayMinimums
 * @Description 子数组的最小值之和
 * https://leetcode-cn.com/problems/sum-of-subarray-minimums/
 * @Author chufule
 * @Date 2021/9/15 16:50
 * @Version 1.0
 */
public class SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int[] left = nearlyLessIndexLeft(arr);
        int[] rignt = nearlyLessEqualIndexRight(arr);
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            long start = i - left[i];
            long end = rignt[i] - i;
            ans += start * end * arr[i];
            ans %= Math.pow(10,9)+7;
        }
        return (int) ans;
    }

    //单调栈实现 数组中位置i的左边比位置i还小的值的位置记录
    public int[] nearlyLessIndexLeft(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        Stack<Integer> stack = new Stack();
        for (int i = n -1 ; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                left[stack.pop()] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            left[stack.pop()] = -1;
        }
        return left;
    }

    public int[] nearlyLessEqualIndexRight(int[] arr){
        int n = arr.length;
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                right[stack.pop()] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            right[stack.pop()] = n;
        }
        return right;
    }

    public static void main(String[] args) {

//        int[] arr = new int[]{11, 81, 94, 43, 3};
//        SumOfSubarrayMinimums s = new SumOfSubarrayMinimums();
//        System.out.println(s.sumSubarrayMins(arr));
        System.out.println(~-4);

    }
}