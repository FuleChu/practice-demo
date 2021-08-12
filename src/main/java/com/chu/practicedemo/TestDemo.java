package com.chu.practicedemo;

import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: chufule
 * @time: 2021/4/2 9:47
 */
public class TestDemo {
    public static void main(String[] args) {
//        String s = "wqqqwew";
//        Set<Character> set = new HashSet<>();
        String s = "aababb";
        try {
            byte[] as = s.getBytes("a");
            System.out.println(as);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
