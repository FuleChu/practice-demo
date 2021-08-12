package com.chu.practicedemo.design.abstractfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 10:52
 */
public class PanPanDrink implements DrinkProduct{
    @Override
    public void milk() {
        System.out.println("盼盼牛奶");
    }

    @Override
    public void juice() {
        System.out.println("盼盼果汁");
    }
}
