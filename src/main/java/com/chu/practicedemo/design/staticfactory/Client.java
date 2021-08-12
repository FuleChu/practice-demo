package com.chu.practicedemo.design.staticfactory;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 14:41
 */
public class Client {

    public static void main(String[] args) {
        //-------静态工厂-----
        GuangZhouCarFactory factory = new GuangZhouCarFactory();
        Car honda = factory.getCar("Honda");
        System.out.println(honda.name());

        //-------工厂方法-----
        HondaFactory hondaFactory = new HondaFactory();
        Car car1 = hondaFactory.getCar();
        System.out.println(car1.name());

        TeslaFactory teslaFactory = new TeslaFactory();
        Car car2 = teslaFactory.getCar();
        System.out.println(car2.name());
    }
}
