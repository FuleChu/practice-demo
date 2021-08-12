package com.chu.practicedemo.design.staticfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 14:37
 */
public class GuangZhouCarFactory implements CarFactory{

    @Override
    public Car getCar(String name) {
        if ("Honda".equals(name)){
            return  new HondaCar();
        } else if ("Tesla".equals(name)){
            return new TeslaCar();
        }else {
            return null;
        }
    }
}
