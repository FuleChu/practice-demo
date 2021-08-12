package com.chu.practicedemo.design.staticfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 15:00
 */
public class TeslaFactory implements CarFactory2{
    @Override
    public Car getCar() {
        return new TeslaCar();
    }
}
