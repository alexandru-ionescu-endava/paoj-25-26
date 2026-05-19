package threads.e_race.a_nosync;

// Race condition: counter++ is read-modify-write (not atomic), so updates get lost.
// Expected 200_000, actual usually less.
public class Ex {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) {
                counter++;
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

