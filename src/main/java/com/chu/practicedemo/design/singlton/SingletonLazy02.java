package com.chu.practicedemo.design.singlton;

/**
 * @description: 单例模式懒加载 会有线程问题
 * @author: chufule
 * @time: 2021/3/17 10:29
 */
public class SingletonLazy02 {
    private static SingletonLazy02 singleton;

    private SingletonLazy02() {
    }

    public SingletonLazy02 getInstance(){
        if (singleton == null) {
            singleton =  new SingletonLazy02();
        }
        return singleton;
    }
}
