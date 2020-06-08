package com.gupaoedu.vip.spring.demo.jinyan;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.concurrent.TimeUnit;

public class TestClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i <1000000 ; i++) {
            double d = Math.random()*1000;
            list.add(d +"");

            //  System.out.println(list);
        }
        long start = System.nanoTime();
        // int count = (int) list.stream().sequential().sorted().count();
        int count  = (int) list.stream().parallel().sorted().count();
        long end = System.nanoTime();
        long ms = TimeUnit.NANOSECONDS.toMillis(end - start);
        System.out.println(ms + "ms");
    }
}
