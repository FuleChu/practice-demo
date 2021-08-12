package com.chu.practicedemo.design.abstractfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 11:50
 */
public class WangWangFactory implements IFactory{
    @Override
    public DrinkProduct buildDrink() {
        return new WangWangDrink();
    }

    @Override
    public FoodProduct buildFood() {
        return new WangWangFood();
    }
}
