package com.chu.practicedemo.design.build;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 19:00
 */
public class Director implements Cloneable{
    IBuildHouse buildHouse;

    public Director(IBuildHouse buildHouse) {
        this.buildHouse = buildHouse;
    }

    House   buildHouse(){
        buildHouse.buildBase();
        buildHouse.buildFloor();
        buildHouse.buildWall();
        buildHouse.buildRoof();
        House house = buildHouse.build();
        return house;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
