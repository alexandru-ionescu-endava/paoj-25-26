package threads.e_race.c_syncmethod;

// Fix: encapsulate state and use synchronized methods (lock = the instance, i.e. `this`).
public class Ex {

    static class Counter {
        private int value = 0;

        public synchronized void increment() {
            value++;
        }

        public synchronized int get() {
            return value;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected: 200000, Actual: " + counter.get());
    }
}

