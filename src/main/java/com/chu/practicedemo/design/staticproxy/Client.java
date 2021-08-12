package com.chu.practicedemo.design.staticproxy;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/17 11:50
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        AgentProxy agentProxy = new AgentProxy();
        agentProxy.setHost(host);
        agentProxy.RentHouse();
    }
}
