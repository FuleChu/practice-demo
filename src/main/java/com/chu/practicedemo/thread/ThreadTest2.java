package com.chu.practicedemo.thread;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/30 16:09
 */
public class ThreadTest2 {

    synchronized public static void printA() {

        try {
            System.out.println("A线程："+Thread.currentThread().getName()+"执行-----start");
            Thread.sleep(1000);
            System.out.println("A线程："+Thread.currentThread().getName()+"执行-----end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public static void printB()  {

        try {
            System.out.println("B线程："+Thread.currentThread().getName()+"执行-----start");
            Thread.sleep(1000);
            System.out.println("B线程："+Thread.currentThread().getName()+"执行-----end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void printC(){
        try {
            System.out.println("C线程："+Thread.currentThread().getName()+"执行-----start");
            Thread.sleep(1000);
            System.out.println("C线程："+Thread.currentThread().getName()+"执行-----end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
