package com.chu.practicedemo.design.singlton;
/**
 * 
 * @ClassName SingletonEnum
 * @Description 枚举类单例模式，解决了线程安全问题，还可以防止反序列化
 * https://www.cnblogs.com/xiarongjin/p/8872878.html
 * @Author chufule
 * @Date 2021/8/19 14:44 
 * @Version 1.0
 */
public enum SingletonEnum {
    INSTANCE;
}
