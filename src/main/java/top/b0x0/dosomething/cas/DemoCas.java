package top.b0x0.dosomething.cas;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * CAS机制问题:
 * 1、循环+CAS的实现让所有的线程处于高频运行，争抢CPU的执行，长时间不成功，会带来很大的CPU资源消耗。
 * 2、只能针对单个变量的操作，不能用于多个标量实现原子操作。
 *
 * @author ManJiis
 * @since 2021-08-03
 */
public class DemoCas {

    int i = 0;
    /**
     * Unsafe java 中操作内存的一个类
     * Unsafe unsafe = Unsafe.getUnsafe()//不能直接使用，需要通过反射来获取
     */
    static Unsafe unsafe;
    /**
     * 内存中的地址(偏移量)
     */
    static long valueOffset;

    static {
        try {
            // 通过反射机制去拿unsafe
            Field filed = Unsafe.class.getDeclaredField("theUnsafe");
            filed.setAccessible(true);
            // 拿到unsafe  参数是要传一个对象，因为是静态的，没有对象所以传Null
            unsafe = (Unsafe) filed.get(null);
            //通过数据去拿到内存中的i地址（偏移量）
            //直接操作内存，获取属性的偏移量（同它来定位对象内具体属性的内存地址）
            valueOffset = unsafe.objectFieldOffset(DemoCas.class.getDeclaredField("i"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 比较和替换
     */
    public void incr() {
        int current = 0;
        do {
            //获取当前内存中的值
            current = unsafe.getIntVolatile(this, valueOffset);
        } while (!unsafe.compareAndSwapInt(this, valueOffset, current, current + 1));
    }

    public static void main(String[] args) {
        DemoCas demo = new DemoCas();
        for (int i = 0; i < 5; i++) {
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
            e.printStackTrace();
        }

    }
}