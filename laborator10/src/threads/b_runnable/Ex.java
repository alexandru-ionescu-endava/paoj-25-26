package threads.b_runnable;


import java.util.Random;

// Way 2 to start a thread: implement Runnable, override run()
// runnable is like a task that can be executed by a thread
// advantage of this approach: the class can extend another class (since Java does not support multiple inheritance)
// we can reuse the same Runnable instance for multiple threads (if needed)
public class Ex {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " is running");
        class RunnableLogger implements Runnable {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running");
                test();
            }

            void test() {
                System.out.println("test method");
            }
        }

        RunnableLogger runnable = new RunnableLogger();

        new Thread(runnable).start();
        new Thread(runnable).start();

//        runnable.test();


        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " hello from anonymous Runnable");
            }
        };
        new Thread(run).start();

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("new task");
            }
        };
        new Thread(task2).start();

         Runnable task3 = () -> System.out.println("new task with lambda");
         new Thread(task3).start();
    }

    static void printNumber() {
        System.out.println(new Random().nextInt());
    }
}
