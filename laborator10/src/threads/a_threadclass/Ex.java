package threads.a_threadclass;


// Way 1: extend Thread, override run().
// run() = same thread (sequential); start() = new thread (concurrent).
public class Ex {

    public static void main(String[] args) {

        class ThreadLogger extends Thread {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        }

        ThreadLogger thread1 = new ThreadLogger();
        thread1.run();

        ThreadLogger thread2 = new ThreadLogger();
        thread2.run();

        ThreadLogger thread3 = new ThreadLogger();
        thread3.start();

        ThreadLogger thread4 = new ThreadLogger();
        thread4.start();
    }
}
