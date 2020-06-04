/*
package com.gupaoedu.vip.v1;

public class ContainerSingletonTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            @Override
            public void handler() {
              Object obj = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");
             System.out.println(System.currentTimeMillis() + ": " + obj);
            }
        },10,6);
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start) + " ms.");
    }
}
*/
