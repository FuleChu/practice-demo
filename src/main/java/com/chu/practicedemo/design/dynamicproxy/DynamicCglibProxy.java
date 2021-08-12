package com.chu.practicedemo.design.dynamicproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: chufule
 * @time: 2021/4/15 11:36
 */
public class DynamicCglibProxy  implements MethodInterceptor {

    private Object rent;

    public void setRent(Object rent) {
        this.rent = rent;
    }

    public Object getInstance(Object target) {
        this.rent = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.rent.getClass());
        // 设置回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGlib动态代理");
        Object invoke = method.invoke(rent, objects);
        return null;
    }
}
