package com.chu.practicedemo.design.abstractfactory;

public interface IFactory {

    DrinkProduct buildDrink();

    FoodProduct buildFood();
}
