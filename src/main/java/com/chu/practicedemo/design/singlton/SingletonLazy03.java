package com.chu.practicedemo.design.singlton;

/**
 * @description: 单例模式懒加载 会有线程问题
 * @author: chufule
 * @time: 2021/3/17 10:29
 */
public class SingletonLazy03 {
    private static SingletonLazy03 singleton;

    private SingletonLazy03() {
    }

    public SingletonLazy03 getInstance(){
        if (singleton == null) {
            //加锁，也还是会有线程安全问题
            synchronized (SingletonLazy03.class) {
                singleton =  new SingletonLazy03();
            }

        }
        return singleton;
    }
}
