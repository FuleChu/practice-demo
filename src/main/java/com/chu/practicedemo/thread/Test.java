package com.chu.practicedemo.thread;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @description: 类锁和对象锁
 *  static synchronized为类锁，多个实例对象也无法异步执行
 *  synchronized为对象锁，多个实例对象可以异步执行
 * @author: chufule
 * @time: 2021/3/30 16:13
 */
public class Test {

    public static void main(String[] args) {

        LinkedHashMap lh = new LinkedHashMap();
        int[] a = new int[10];
        Map<Integer, Integer> map = new HashMap<>();

        ThreadTest2 test1 = new ThreadTest2();
        ThreadTest2 test2 = new ThreadTest2();

        new Thread(()->{
            test1.printA();
        },"A").start();
        new Thread(()->{
            test2.printB();
        },"B").start();
      /*  A线程：A执行-----start
        A线程：A执行-----end
        B线程：B执行-----start
        B线程：B执行-----end*/
        new Thread(()->{
            test1.printC();
        },"C").start();
    }

//    class ThreadA extends Thread{
//        private ThreadTest2 s;
//
//        public ThreadA(ThreadTest2 s) {
//            super();
//            this.s = s;
//        }
//        @Override
//        public void run() {
//            s.printA();
//        }
//    }
//
//
//    class ThreadB extends Thread{
//        private ThreadTest2 s;
//
//        public ThreadB(ThreadTest2 s) {
//            super();
//            this.s = s;
//        }
//        @Override
//        public void run() {
//            s.printB();
//        }
//    }
//
//class ThreadC extends Thread{
//	private Service s;
//
//	public ThreadC(Service s) {
//		super();
//		this.s = s;
//	}
//	@Override
//	public void run() {
//		s.printC();
//	}
//}

}
