package com.chu.practicedemo.design.adapter;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 11:00
 */
public class Computer {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        AdapterUsbToNet adapterUsbToNet = new AdapterUsbToNet();
        adapterUsbToNet.setAdaptee(adaptee);

        adapterUsbToNet.handle();
    }
}
