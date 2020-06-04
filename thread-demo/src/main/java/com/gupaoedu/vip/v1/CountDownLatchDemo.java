package com.gupaoedu.vip.v1;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo extends  Thread{

    static CountDownLatch countDownLatch = new CountDownLatch(1);
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            new CountDownLatchDemo().start();
        }
        countDownLatch.countDown();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();//阻塞
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ThreadName:"+Thread.currentThread().getName());
    }
}
