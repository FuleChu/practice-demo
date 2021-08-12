package com.chu.practicedemo.design.abstractfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 11:14
 */
public class PanPanFactory implements IFactory{
    @Override
    public DrinkProduct buildDrink() {
        return new PanPanDrink();
    }

    @Override
    public FoodProduct buildFood() {
        return new PanPanFood();
    }
}
