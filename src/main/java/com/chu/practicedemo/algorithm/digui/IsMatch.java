package com.chu.practicedemo.algorithm.digui;

/**
 * @ClassName IsMatch
 * @Description TODO
 * @Author chufule
 * @Date 2021/8/13 17:07
 * @Version 1.0
 */
public class IsMatch {

    public boolean isMatch(String s, String p) {
        if (p.isEmpty()){
            return s.isEmpty();
        }
        boolean match = !s.isEmpty() && ((s.charAt(0) == p.charAt(0)) || p.charAt(0) == '.');
        if (p.length() >= 2 && p.charAt(1) == '*'){
            return isMatch(s, p.substring(2)) || (match && isMatch(s.substring(1), p));
        }

        return match && isMatch(s.substring(1), p.substring(1));
    }


}
