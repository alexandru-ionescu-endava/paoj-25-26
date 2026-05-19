package threads.d_interrupt;

public class Ex {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started");

        class ThreadWorker extends Thread {

            @Override
            public void run() {
                int count = 0;

                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Working ... " + (++count));
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Gracefully stopping worker thread after " + count + " iterations");
            }
        }

        ThreadWorker worker = new ThreadWorker();
        worker.start();
        Thread.sleep(800);
        worker.interrupt();
        worker.join();

        System.out.println("Main thread ended");
    }
}
