package com.chu.practicedemo.design.build;

public interface IBuildHouse {

    void buildBase();
    void buildFloor();
    void buildWall();
    void buildRoof();

    House build();
}
