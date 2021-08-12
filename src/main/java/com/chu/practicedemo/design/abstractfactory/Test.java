package com.chu.practicedemo.design.abstractfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/18 11:51
 */
public class Test {
    public static void main(String[] args) {
        FactoryProduct factoryProduct = new FactoryProduct();
        System.out.println("========旺旺产品===========");
        IFactory wangwangFactory = factoryProduct.getFactory("wangwang");
        DrinkProduct wangwangDrinkProduct = wangwangFactory.buildDrink();
        wangwangDrinkProduct.juice();
        wangwangDrinkProduct.milk();
        FoodProduct foodProduct = wangwangFactory.buildFood();
        foodProduct.bread();
        foodProduct.eggPie();

        System.out.println("========盼盼产品===========");
        IFactory panpanFactory = factoryProduct.getFactory("panpan");
        DrinkProduct panpanDrinkProduct = wangwangFactory.buildDrink();
        panpanDrinkProduct.juice();
        panpanDrinkProduct.milk();

    }
}
