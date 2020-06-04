package com.gupaoedu.vip.v1;

public class ThreadPoolTest {

    private static int num = 0;

    public static void main(String[] args) {
        //每个线程所拿到num的值是不确定的
        Thread [] threads = new Thread[5];
        for (int i = 0; i <threads.length; i++) {
            threads[i] = new Thread(()->{
                num +=5;
                System.out.println(Thread.currentThread().getName() +":"+num);
            },"thread-"+i);
        }
        for (Thread thread:threads){
            thread.start();
        }
    }
}
