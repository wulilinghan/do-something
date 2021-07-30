package top.b0x0.dosomething.printABC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ManJiis
 * @date 2019/12/13
 */
public class PrintAbcDemo {
    public static void main(String[] args) {
        final ThreadAbc t = new ThreadAbc();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i < 10; i++) {
                                t.printA();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                })
                .start();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i < 10; i++) {
                                t.printB();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                })
                .start();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i < 10; i++) {
                                t.printC();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                })
                .start();
    }
}

/**
 * @author ManJiis
 * @date 2019/12/13
 */
class ThreadAbc {
    volatile int num = 1;
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void printA() throws InterruptedException {
        lock.lock();
        if (num != 1) {
            c1.await();
        }
        System.out.println("A");
        num = 2;
        c2.signal();
        lock.unlock();
    }

    public void printB() throws InterruptedException {
        lock.lock();
        if (num != 2) {
            c2.await();
        }
        System.out.println("B");
        num = 3;
        c3.signal();
        lock.unlock();
    }

    public void printC() throws InterruptedException {
        lock.lock();
        if (num != 3) {
            c3.await();
        }
        System.out.println("C");
        num = 1;
        c1.signal();
        lock.unlock();
    }
}