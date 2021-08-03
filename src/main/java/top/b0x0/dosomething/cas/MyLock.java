package top.b0x0.dosomething.cas;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * 实现Lock 接口，重写lock()和unlock()方法
 *
 * @author ManJiis
 * @since 2021-08-03
 */
public class MyLock implements Lock {

    /**
     * 原子操作类
     */
    AtomicReference<Thread> owner = new AtomicReference<Thread>();
    /**
     * 拿不到锁的线程，需要一个等待的列表。
     */
    public LinkedBlockingDeque<Thread> waiter = new LinkedBlockingDeque<>();

    @Override
    public void lock() {
        //进行当前线程设置
        //成功则返回ture。循环进行处理
        owner.compareAndSet(null, Thread.currentThread());
        //如果当前线程拿不到锁
        while (!owner.compareAndSet(null, Thread.currentThread())) {
            //拿不到的情况，等待，加入等待列表中
            waiter.add(Thread.currentThread());
            //让当前线程等待(一直卡在这里)
            LockSupport.park();
            //如果能够执行到这段的话，证明被唤醒了，所以要从等待列表中删除
            waiter.remove(Thread.currentThread());
        }
    }

    @Override
    public void unlock() {
        //当前线程与内存中的那个线程进行比较，如果是的，把内存中的线程至空
        if (owner.compareAndSet(Thread.currentThread(), null)) {
            //锁被释放了，需要告知其他线程，所有线程可以去拿锁了(唤醒所有等待线程)
            //等待列表转成数组
            Object[] objects = waiter.toArray();
            //遍历，拿到所有等待的线程
            for (Object object : objects) {
                Thread next = (Thread) object;
                // 把线程唤醒
                LockSupport.unpark(next);
            }
        }

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean tryLock() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public Condition newCondition() {
        // TODO Auto-generated method stub
        return null;
    }

}