package com.chu.practicedemo.algorithm;

import java.util.ArrayList;

class Search {
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        return process(nums,0,nums.length-1,target);
    }

    public static int process(int[] nums,int start, int end, int target){
        int count = 0;
        if (start > end) {
            return count;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            count ++;
            count += process(nums,start,mid-1,target);
            count += process(nums,mid+1,end,target);
        }else if (nums[mid] > target) {
            count += process(nums,start,mid-1,target);
        } else if (nums[mid] < target) {
            count += process(nums,mid+1,end,target);
        }
        return count;
    }



    public static void main(String[] args) {
//        int[] arr = {5,7,7,8,8,10};
//        System.out.println(search(arr, 8));
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.stream().anyMatch("superAdmin"::equalsIgnoreCase));
    }

}