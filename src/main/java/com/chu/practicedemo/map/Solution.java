package com.chu.practicedemo.map;

class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 =1;
        for(int i = 2;i <= n;i++){
            int num2 = 2 * dp[p2],num3 = 3*dp[p3],num5=5*dp[p5];
            dp[i] = Math.min(Math.min(num2,num3),num5);
            if(dp[i] == num2) {
                p2++;
            } 
            if(dp[i] == num3) {
                p3++;
            }
            if(dp[i] == num5) {
                p5++;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.nthUglyNumber(10);
        System.out.println(i);
    }
}