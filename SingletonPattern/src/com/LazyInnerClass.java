package com;

import java.util.concurrent.CountDownLatch;

public class LazyInnerClass {


    private LazyInnerClass()
    {}

    public static LazyInnerClass getInstance()
    {
        return lazyInner.lazy;
    }

    private static class lazyInner{
        public static LazyInnerClass lazy;
        static{
            lazy = new LazyInnerClass();
        }

    }

    public static void main(String[] args) throws Exception{
        CountDownLatch latch = new CountDownLatch(1);
        for(int i=0;i<10;i++)
        {
            new Thread(()->{
                try
                {
                    latch.await();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }

                System.out.println(System.currentTimeMillis()+"|"+LazyInnerClass.getInstance());
            }).start();
        }
        Thread.sleep(3000);
        latch.countDown();
        System.out.println("==========end==============");
    }
}
