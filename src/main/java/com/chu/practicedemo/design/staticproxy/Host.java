package com.chu.practicedemo.design.staticproxy;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 11:36
 */
public class Host implements Rent{
    @Override
    public void RentHouse() {
        System.out.println("房东出租房子！");
    }
}
