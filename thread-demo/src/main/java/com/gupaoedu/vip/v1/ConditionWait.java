package com.gupaoedu.vip.v1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ConditionWait implements  Runnable{
    private Lock lock;

    private Condition condition;

    public ConditionWait(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        try{
        lock.lock();//竞争锁
            System.out.println("begin----await");
        try {
            condition.await();//阻塞
            System.out.println("end----await");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }finally {
            lock.unlock();//释放锁
        }


    }
}
