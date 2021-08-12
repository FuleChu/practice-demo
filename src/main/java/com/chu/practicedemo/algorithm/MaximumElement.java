package com.chu.practicedemo.algorithm;

import java.util.*;

//https://leetcode-cn.com/problems/maximum-element-after-decreasing-and-rearranging/
class MaximumElement {
    public static int maximumElementAfterDecrementingAndRearranging1(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i-1]-arr[i] )>1) {
                arr[i] = arr[i-1] + 1;
            }
        }
        return arr[arr.length-1];
    }
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        int[] cnt = new int[n + 1];
        for (int v : arr) {
            ++cnt[Math.min(v, n)];
        }
        int miss = 0;
        for (int i = 1; i <= n; ++i) {
            if (cnt[i] == 0) {
                ++miss;
            } else {
                miss -= Math.min(cnt[i] - 1, miss); // miss 不会小于 0，故至多减去 miss 个元素
            }
        }
        return n - miss;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,2,1};
        int i = maximumElementAfterDecrementingAndRearranging(arr);
        System.out.println(i);
    }
}