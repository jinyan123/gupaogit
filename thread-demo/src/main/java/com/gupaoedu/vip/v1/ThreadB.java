package com.gupaoedu.vip.v1;

public class ThreadB   extends Thread{

    private  Object lock;

    public ThreadB(Object lock){
        this.lock = lock;

    }

    @Override
    public void run() {
     synchronized (lock){
         System.out.println("start ThreadB");
         lock.notify();//线程的唤醒
         System.out.println("end ThreadB");
     }
    }
}
