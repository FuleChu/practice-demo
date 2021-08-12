package com.chu.practicedemo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/16 16:53
 */
public class Demo<T> {

    public static void main(String[] args) throws InterruptedException {
//        volatile
////        Demo demo = new Demo<String>();
////        List<Integer> list = new ArrayList<>();
////        list.add(1);
////        System.out.println(demo.getFirst(list));
//        Threadccc threadccc = new Threadccc();
//        threadccc.start();
//        System.out.println("当前线程" + Thread.currentThread().getName());
//        Executors.newSingleThreadExecutor();
//
//        new ThreadPoolExecutor(10,10,60,TimeUnit.SECONDS,new ArrayBlockingQueue(10), new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//                Thread thread = new Thread("cccc-thread");
//                return thread;
//            }
//        }, new ThreadPoolExecutor.AbortPolicy());
//
//        ReentrantLock reentrantLock = new ReentrantLock();
//        reentrantLock.lock();
//        Semaphore semaphore = new Semaphore(0);
//        semaphore.release();
//        semaphore.acquire();
//        System.out.println(1);
//        semaphore.release();
//        System.out.println(2);
//        semaphore.acquire();
//        System.out.println(3);
//        semaphore.acquire();
//        Integer i1 = 15;
//        Integer i2 = 15;
//        System.out.println(i1 == i2);
//        Integer i3 = 150;
//        Integer i4 = 150;
//        System.out.println(i3 == i4);
//        String a = "111";
//        String a1 = "111";
//
//        String b = new String("111");
//
//        String a2 = "111";
//
//        //对象地址是同一个
//        System.out.println(a==a1);
//        //对象内容是一样的
//        System.out.println(a.equals(a1));
//        //对象地址不一样
//        System.out.println(a==b);
//        //对象内容是一样的
//        System.out.println(a.equals(b));
//
//        //对象地址不一样
//        System.out.println(a1==a2);
//
//        //对象地址一样?
//        System.out.println(b==a2);
        int a = 2;
        int b = 3;
        System.out.println( a<<1 ^ (b & ((~b) | 1)));
        System.out.println( a<<1 ^ (b >>>1));
        System.out.println( a ^ (a<<1) ^b);
        System.out.println( a<<1 | a^b);

    }

    private T getFirst(List<T> list){
//        if (CollectionUtils.isEmpty(list)){
//            return null;
//        }
        return list.get(0);
    }


}
class Threadccc extends Thread implements Callable {
    @Override
    public void run() {
        System.out.println("当前线程" + Thread.currentThread().getName());
    }

    @Override
    public Object call() throws Exception {
        return null;
    }

}
