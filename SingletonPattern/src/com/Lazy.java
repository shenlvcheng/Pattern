package com;

import java.util.concurrent.CountDownLatch;

public class Lazy {
    private static volatile Lazy lazy;

    private Lazy()
    {}

    public static Lazy getInstance()
    {
        if(lazy==null)
        {
            synchronized(Lazy.class)
            {
                if(lazy==null)
                {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
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

                System.out.println(System.currentTimeMillis()+"|"+Lazy.getInstance());
            }).start();
        }
        Thread.sleep(3000);
        latch.countDown();
        System.out.println("==========end==============");
    }
}
