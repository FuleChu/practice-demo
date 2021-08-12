package com.chu.practicedemo.design.build;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 17:50
 */
public class WankeBuilders implements IBuildHouse{
    private  House house;

    public WankeBuilders() {
        house = new House();
    }

    @Override
    public void buildBase() {
        house.setBase("万科地基");
    }

    @Override
    public void buildFloor() {
        house.setFloor("万科地板");
    }

    @Override
    public void buildWall() {
        house.setWall("万科墙面");
    }

    @Override
    public void buildRoof() {
        house.setRoof("万科墙顶");
    }

    @Override
    public House build() {
        return house;
    }
}
