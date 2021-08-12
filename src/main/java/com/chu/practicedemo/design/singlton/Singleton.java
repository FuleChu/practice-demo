package com.chu.practicedemo.design.singlton;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 10:29
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public Singleton getInstance(){
        if (singleton == null) {
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton =  new Singleton();
                }
            }
        }
        return singleton;
    }
}
