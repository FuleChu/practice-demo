package com.chu.practicedemo.thread;

import com.chu.practicedemo.design.build.Director;

import java.util.Currency;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/22 10:10
 */
public class Demo1 implements Cloneable{


    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5,()->{
            System.out.println("执行完之后-----");
        });
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"执行");
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+"到达栏栅");
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}
