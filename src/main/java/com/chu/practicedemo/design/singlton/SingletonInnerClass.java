package com.chu.practicedemo.design.singlton;

/**
 * @ClassName SingletonInnerClass
 * @Description 静态内部类实现单例模式，JVM只会加载一次类，而外部类被加载时不会加载内部类，调用getInstance时才会加载静态内部类，保证了实例单例
 * @Author chufule
 * @Date 2021/8/19 14:19
 * @Version 1.0
 */
public class SingletonInnerClass {

    private SingletonInnerClass(){

    }

    static class InstanceHold{
        private static SingletonInnerClass instance = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return InstanceHold.instance;
    }
}
