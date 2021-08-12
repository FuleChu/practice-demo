package com.chu.practicedemo.design.adapter;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 11:01
 */
public class AdapterUsbToNet implements UsbToNet{

    private Adaptee adaptee;

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handle() {
        adaptee.net();
    }
}
