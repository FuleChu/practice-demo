package com.chu.practicedemo.design.staticfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 14:35
 */
public class TeslaCar implements Car{
    @Override
    public String name() {
        return "特斯拉汽车！";
    }
}
