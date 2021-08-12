package com.chu.practicedemo.design.abstractfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 11:45
 */
public class PanPanFood implements FoodProduct{
    @Override
    public void bread() {
        System.out.println("盼盼小面包");
    }

    @Override
    public void eggPie() {
        System.out.println("盼盼蛋黄派");
    }
}
