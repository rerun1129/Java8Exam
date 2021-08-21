package completablefuture.completableFuture2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        boolean throwError = true;

        CompletableFuture<String> hello1 = CompletableFuture.supplyAsync(() -> {
            if (throwError) {
                throw new IllegalArgumentException();
            }
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).handle((result, ex) -> {
            if (ex != null) {
                System.out.println(ex);
                return "error!";
            }
            return result;
        });

        System.out.println(hello1.get());

        /*CompletableFuture<String> hello2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("world " + Thread.currentThread().getName());
            return "world";
        });*/


        //anyOf
        /*CompletableFuture<Void> future = CompletableFuture
                .anyOf(hello1, hello2)
                .thenAccept(System.out::println);

        future.get();*/


        //allOf
        /*List<CompletableFuture<String>> futures = Arrays.asList(hello1,hello2);
        CompletableFuture[] futures1 = futures.toArray(new CompletableFuture[futures.size()]);

        CompletableFuture<List<String>> results = CompletableFuture
                .allOf(futures1)
                .thenApply((v) -> {
                    return futures.stream().map(CompletableFuture::join)
                            .collect(Collectors.toList());
                });
        results.get().forEach(System.out::println);*/
    }
}
