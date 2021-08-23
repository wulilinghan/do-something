package top.b0x0.dosomething.future;

import java.util.concurrent.*;

/**
 * @author ManJiis
 * @since 2021-08-23
 * @since JDK1.8
 */
public class FuTaskTest {
    private static ExecutorService pool = new ThreadPoolExecutor(5, 10, 30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FuTask fuTask1 = new FuTask("张三丰");
        Future<?> submit = pool.submit(fuTask1);
        Object o1 = submit.get();
        System.out.println("o1 = " + o1);

        // -------------------------------------------------------

        FuTask fuTask2 = new FuTask("张三丰");
        FutureTask<String> futureTask = new FutureTask<>(fuTask2);
        pool.submit(futureTask);
        Object o = futureTask.get();
        System.out.println("o2 = " + o);

        // -------------------------------------------------------
        FuTask fuTask3 = new FuTask("张三丰");
        FutureTask<String> futureTask3 = new FutureTask<>(fuTask3);
        new Thread(futureTask3).start();
        String o3 = futureTask3.get();
        System.out.println("o3 = " + o3);

        // -------------------------------------------------------

        pool.shutdown();
    }
}
