package com.chu.practicedemo.design.staticproxy;

/**
 * @description: 中介
 * @author: chufule
 * @time: 2021/3/17 11:38
 */
public class AgentProxy implements Rent{

    private Host host;

    public AgentProxy() {
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void RentHouse() {
        see();
        host.RentHouse();
    }

    private void see(){
        System.out.println("中介代看房子");
    }
}
