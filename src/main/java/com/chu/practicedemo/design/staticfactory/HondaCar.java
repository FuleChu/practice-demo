package com.chu.practicedemo.design.staticfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 14:34
 */
public class HondaCar implements Car{
    @Override
    public String name() {
        return "本田汽车！";
    }
}
