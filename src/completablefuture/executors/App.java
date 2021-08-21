package completablefuture.executors;

import java.util.concurrent.*;

public class App {

    public static void main(String[] args) {

        /*ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> System.out.println("쓰레드 : " + Thread.currentThread().getName()));
        executorService.shutdown();*/

        /*ExecutorService executorService2 = Executors.newFixedThreadPool(2);
        executorService2.submit(getRunnable("Hello"));
        executorService2.submit(getRunnable("Keesun"));
        executorService2.submit(getRunnable("The"));
        executorService2.submit(getRunnable("Java"));
        executorService2.submit(getRunnable("Thread"));
        executorService2.shutdown();*/

        ScheduledExecutorService executorService3 = Executors.newSingleThreadScheduledExecutor();
        executorService3.scheduleAtFixedRate(getRunnable("Hello"),1, 2,TimeUnit.SECONDS);

        executorService3.shutdown();


    }

    private static Runnable getRunnable(String message) {
        return () -> System.out.println("쓰레드 : " + Thread.currentThread().getName());
    }
}
