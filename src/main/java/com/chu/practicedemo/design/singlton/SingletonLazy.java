package com.chu.practicedemo.design.singlton;

/**
 * @description: 单例模式懒加载 双层检查
 * @author: chufule
 * @time: 2021/3/17 10:29
 */
public class SingletonLazy {
    private static volatile SingletonLazy singleton;

    private SingletonLazy() {
    }

    public SingletonLazy getInstance(){
        if (singleton == null) {
            synchronized (SingletonLazy.class){
                //双层检查
                if (singleton == null) {
                    singleton =  new SingletonLazy();
                }
            }
        }
        return singleton;
    }
}
