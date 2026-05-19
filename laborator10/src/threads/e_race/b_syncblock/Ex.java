package threads.e_race.b_syncblock;

// Fix: synchronized block on a shared lock - only one thread inside at a time.
public class Ex {

    private static int counter = 0;
    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (lock) {
                    counter++;
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected: 200000, Actual: " + counter);
    }
}

