package com.gupaoedu.vip.v1;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    static  class Car extends  Thread{
        private int num;

        private Semaphore semaphore;

        public Car(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();//获得一个令牌，如果拿不到令牌，就会阻塞
                System.out.println("第"+ num +"抢占一个车位");
            //    Thread.sleep(2000);
                System.out.println("第"+ num +"开走啦");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        for (int i = 1; i < 20; i++) {
            new Car(i,semaphore).start();

        }
    }

}
