package com.gupaoedu.vip.v1;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingDemo {

    ArrayBlockingQueue<String> ab = new ArrayBlockingQueue<>(10);

    {
        init();//构造方法
    }

    public void init(){
        new Thread(()->{
            while(true){
                try{
                    String data =  ab.take();//阻塞方式获得元素
                    System.out.println("receive:"+data);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public  void addData(String data) throws InterruptedException {
        ab.add(data);
        System.out.println("sendData:"+data);
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingDemo blockingDemo = new BlockingDemo();
        for (int i = 0; i <1000 ; i++) {
            blockingDemo.addData("data:" +i);
        }
    }
}
