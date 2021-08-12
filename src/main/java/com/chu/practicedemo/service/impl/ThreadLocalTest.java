package com.chu.practicedemo.service.impl;

import com.baomidou.mybatisplus.extension.api.R;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: chufule
 * @time: 2021/5/10 10:22
 */
public class ThreadLocalTest {
    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(2,2,60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 1; i++) {
//            executor.execute(()->{
//                RpcContext.open("11111");
//                System.out.println(RpcContext.getContext().getTenantId());
//            });
////            Thread.sleep(10);
//            executor.execute(()->{
////                RpcContext.open("11111");
//                System.out.println(RpcContext.getContext().getTenantId());
//            });
//        }
        RpcContext.open("11111");
        System.out.println(RpcContext.getContext().getTenantId());
        RpcContext.open2("2222");
        System.out.println(RpcContext.get2());

    }
}
