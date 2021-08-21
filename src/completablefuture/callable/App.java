package completablefuture.callable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "hello";
        };
        /*Future<String> submit = executorService.submit(hello);
        System.out.println(submit.isDone());
        System.out.println("스타트!");

        submit.cancel(false);

        submit.get();
        System.out.println(submit.isDone());
        System.out.println("끝!");
        executorService.shutdown();*/
        Callable<String> java = () -> {
            Thread.sleep(3000L);
            return "java";
        };
        Callable<String> keesun = () -> {
            Thread.sleep(1000L);
            return "keesun";
        };

        String s = executorService.invokeAny(Arrays.asList(java,keesun,hello));
        System.out.println(s);

        executorService.shutdown();
    }
}
