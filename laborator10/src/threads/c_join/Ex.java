package threads.c_join;

public class Ex {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread started");
        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(task("A"));
        Thread t2 = new Thread(task("B"));
        Thread t3 = new Thread(task("C"));

        t1.start();

        t2.start();
        Thread.sleep(500);
//        t2.start();

        t3.start();

//        t1.join();
        t2.join();
//        t3.join();

        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("main thread ended in " + elapsed + " ms");
    }

    private static Runnable task(String name) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);

                    if (name.equals("B")) {
                        Thread.sleep(2_000);
                    }

                } catch (InterruptedException e) {
                    System.out.println(name + " was interrupted");
                }
                System.out.println("done: " + name);
            }
        };

        return runnable;
    }
}
