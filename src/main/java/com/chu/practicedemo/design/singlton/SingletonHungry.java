package com.chu.practicedemo.design.singlton;

/**
 * @ClassName SingletonHungry
 * @Description TODO
 * @Author chufule
 * @Date 2021/8/19 11:16
 * @Version 1.0
 */
public class SingletonHungry {
    private static final SingletonHungry instance = new SingletonHungry();
    //或者使用静态代码块
//    static {
//        instance = new SingletonHungry();
//    }

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
