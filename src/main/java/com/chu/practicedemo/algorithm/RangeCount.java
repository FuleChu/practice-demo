package com.chu.practicedemo.algorithm;

/**
 * @ClassName RangeCount
 * @Description 区间和在范围上
 * @Author chufule
 * @Date 2021/5/27 15:59
 * @Version 1.0
 */
public class RangeCount {

    public static int countRangeSum(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        long[] sum = new long[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        int process = process(sum, 0, sum.length - 1, lower, upper);
        return process;
    }

    public static int process(long[] sum, int L, int R, int lower, int height) {
        if (L == R) {
            return (sum[L] >= lower && sum[L] <= height) ? 1 : 0;
        }
        int mid = L + ((R - L) >> 1);
        return process(sum, L, mid, lower, height) + process(sum, mid + 1, R, lower, height) + merge(sum, L, mid, R, lower, height);
    }

    public static int merge(long[] sum, int L, int M, int R, int lower, int height) {
        int count = 0;
        int windowL = L;
        int windowR = L;
        int m = M + 1;
        for (int i = m; i <= R; i++) {
            long min = sum[i] - height;
            long max = sum[i] - lower;
            //[x,y) 窗口为左闭右开
            while (windowL <= M && sum[windowL] < min) {
                windowL++;
            }
            while (windowR <= M && sum[windowR] <= max) {
                windowR++;
            }
            count += windowR - windowL;
        }
        int l = L;
        int r = M + 1;
        int length = (R - L) + 1;
        long[] help = new long[length];
        int index = 0;
        while (l <= M && r <= R) {
            help[index++] = sum[l] <= sum[r] ? sum[l++] : sum[r++];
        }
        while (l <= M) {
            help[index++] = sum[l++];
        }
        while (r <= R) {
            help[index++] = sum[r++];
        }
        for (int i = 0; i < help.length; i++) {
            sum[L++] = help[i];
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] arr = {-2, 5, -1}; -2 2  3
//        int[] arr = {-3,1,2,-2,2,-1}; -3 -1 7
        int[] arr = {-2147483647,0,-2147483647,2147483647};
        int solution = countRangeSum(arr, -564 ,3864);
        //
        System.out.println(solution);
    }
}
