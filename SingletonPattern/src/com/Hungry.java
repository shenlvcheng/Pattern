package com;

import java.util.concurrent.CountDownLatch;

public class Hungry {
    private static final Hungry hungry = new Hungry();

    private Hungry()
    {}

    public static Hungry getInstance()
    {
        return hungry;
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

                System.out.println(System.currentTimeMillis()+"|"+Hungry.getInstance());
            }).start();
        }
        Thread.sleep(3000);
        latch.countDown();
        System.out.println("==========end==============");
    }

}
