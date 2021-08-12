package com.chu.practicedemo.design.build;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 19:36
 */
public class Test {
    public static void main(String[] args) {
        IBuildHouse buildHouse = new WankeBuilders();
        Director director = new Director(buildHouse);
        House house = director.buildHouse();
        System.out.println(house.toString());
    }
}
