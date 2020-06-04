package com.gupaoedu.vip.v1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
       /* Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        ThreadB threadB = new ThreadB(lock);
        threadB.start();*/

       Lock lock = new ReentrantLock();
        Condition  condition  = lock.newCondition();

        new Thread(new ConditionWait(lock,condition)).start();
        new Thread(new ConditionNotify(lock,condition)).start();
     /* String str = "a,b,c,d,e,g,k";
      String[] ary = str.split(",");
        System.out.println(ary.length);
     method("null");*/
    }

 /*   private static void method(String param) {
        switch (param){
            case "null":
                System.out.println("it's null");
            case "sth":
                System.out.println("it's sth");
                break;

            default:
                System.out.println("default");
        }
    }*/
/* public static long count = 0;
 public static void method(long i){
     System.out.println(count++);
     method(i);
 }

    public static void main(String[] args) {
        method(1);
    }*/

}
