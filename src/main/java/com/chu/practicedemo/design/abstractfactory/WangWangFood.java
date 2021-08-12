package com.chu.practicedemo.design.abstractfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 11:45
 */
public class WangWangFood implements FoodProduct{
    @Override
    public void bread() {
        System.out.println("旺旺小面包");
    }

    @Override
    public void eggPie() {
        System.out.println("旺旺蛋黄派");
    }
}
