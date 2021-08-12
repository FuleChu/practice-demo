package com.chu.practicedemo.algorithm;

import java.util.*;

//https://leetcode-cn.com/problems/relative-ranks/
class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        if (score == null) {
            return null;
        }
        PriorityQueue<Integer> queue = new PriorityQueue((a,b)->score[(int)b]-score[(int)a]);
        for (int i = 0; i < score.length; i++) {
            queue.offer(Integer.valueOf(i));
        }
        String[] result = new String[score.length];
        int index = 1;
        while (!queue.isEmpty()) {
            if (index == 1) {
                result[queue.poll()] = "Gold Medal";
            } else if (index == 2) {
                result[queue.poll()] = "Silver Medal";
            } else if (index == 3) {
                result[queue.poll()] = "Bronze Medal";
            } else {
                result[queue.poll()] = String.valueOf(index);
            }
            index++;
        }
        return result;
    }
}