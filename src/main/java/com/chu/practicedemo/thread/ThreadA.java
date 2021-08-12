package com.chu.practicedemo.thread;

/**
 * @description:
 * @author: chufule
 * @time: 2020/11/26 17:05
 */
class ThreadA {
   	public static void main(String[] args) throws InterruptedException {
   	    ThreadB b=new ThreadB();

   	    System.out.println("b is start....");
        b.start();
		//同步，请求获得对象锁，如果是子线程先进入，则这里阻塞
   	    synchronized(b){
   	        try {
   	            System.out.println("Waiting for b to complete...");
   	            b.wait();//获得对象锁后，可以调用对象的wait方法，这个时候释放对象锁，自线程取得对象锁，进入工作
                System.out.println("Completed.Now back to main thread");
   	        }catch (InterruptedException e){}
   	    }
   	    System.out.println("Total is :"+b.total);
   	}
}

 class ThreadB extends Thread  {

 		int total;
	@Override
	public void run()  {
			//同步，请求获得对象锁，如果是主线程先进入，则这里阻塞
			synchronized(this){
 			System.out.println("ThreadB is running..");
 			for (int i=0;i<100;i++ ){
 					total +=i;
 					System.out.println("total is "+total);
 				}
 			notifyAll();
 	   }
		}
}

