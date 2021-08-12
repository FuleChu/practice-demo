package com.chu.practicedemo.design.staticfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 14:58
 */
public class HondaFactory implements CarFactory2{
    @Override
    public Car getCar() {
        return new HondaCar();
    }
}
