package completablefuture.concurrent_programming;

public class App {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {

            System.out.println("Thread : " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }

        });
        thread.start();
        System.out.println("Hello : " + Thread.currentThread().getName());
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread + " 끝");
    }
}

