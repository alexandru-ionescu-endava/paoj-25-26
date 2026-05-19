package threads.f_executor;

import java.util.concurrent.Executors;

// ExecutorService manages a thread pool - no manual start/join.
// execute(Runnable) submits a task; shutdown() + awaitTermination() wait for completion.
public class Ex {

    public static void main(String[] args) throws InterruptedException {

        try (var svc = Executors.newFixedThreadPool(3)) {
            Runnable task = () -> {
                System.out.println("Hello from " + Thread.currentThread().getName());
            };

            for (int i = 0; i < 10; i++)
                svc.submit(task);
        }
    }
}

