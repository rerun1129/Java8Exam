package completablefuture.completableFuture;

import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.concurrent.*;

public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

       ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<String> future = executorService.submit(() -> "hello");

        future.get();
        CompletableFuture<String> future0 = new CompletableFuture<>();
        future0.complete("keesun");
        System.out.println(future.get());

        CompletableFuture<String> future1 = CompletableFuture.completedFuture("keesun");
        System.out.println(future1.get());

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(()->{
            System.out.println("Hello " + Thread.currentThread().getName());
        });
        future2.get();

        executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        },executorService).thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        voidCompletableFuture.get();
        executorService.shutdown();


    }
}
