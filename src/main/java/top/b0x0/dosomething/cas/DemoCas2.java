package top.b0x0.dosomething.cas;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class DemoCas2 {
    MyLock myLock = new MyLock();
    int i = 0;

    public void incr() {
        //比较和替换
        myLock.lock();
        i++;
        myLock.unlock();

    }

    public static void main(String[] args) {
        DemoCas2 demo = new DemoCas2();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    demo.incr();
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
            System.out.println("i=" + demo.i);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}