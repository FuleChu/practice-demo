package com.chu.practicedemo.design.build;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 19:43
 */
public class Test2 {
    public static void main(String[] args) {
        WankeBuilders wankeBuilders = new WankeBuilders();
        wankeBuilders.buildRoof();
        wankeBuilders.buildWall();
        wankeBuilders.buildFloor();
        wankeBuilders.buildBase();
        House build = wankeBuilders.build();
        System.out.println(build);
    }
}
