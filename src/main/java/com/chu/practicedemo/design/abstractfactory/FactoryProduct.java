package com.chu.practicedemo.design.abstractfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 11:48
 */
public class FactoryProduct {

    IFactory getFactory(String name){
        if ("panpan".equalsIgnoreCase(name)){
            return new PanPanFactory();
        }else if ("wangwang".equalsIgnoreCase(name)) {
            return new WangWangFactory();
        }else {
            return null;
        }
    }
}
