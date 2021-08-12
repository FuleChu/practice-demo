package com.chu.practicedemo.design.dynamicproxy;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 14:09
 */
public class Client {

    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        Host host = new Host();
        dynamicProxy.setRent(host);
        Rent proxy = (Rent) dynamicProxy.getProxy();
        proxy.RentHouse();


        DynamicCglibProxy dynamicCglibProxy = new DynamicCglibProxy();
        LisiRent instance = (LisiRent) dynamicCglibProxy.getInstance(new LisiRent());
        instance.rent();
    }
}
