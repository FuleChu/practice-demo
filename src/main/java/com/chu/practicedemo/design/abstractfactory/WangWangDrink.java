package com.chu.practicedemo.design.abstractfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 10:53
 */
public class WangWangDrink implements DrinkProduct{
    @Override
    public void milk() {
        System.out.println("旺旺牛奶");
    }

    @Override
    public void juice() {
        System.out.println("旺旺果汁");
    }
}
