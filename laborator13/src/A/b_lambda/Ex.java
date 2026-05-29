package A.b_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executors;

public class Ex {
    public static void main(String[] args) {

        // lambda expressions are a way to create anonymous functions in Java.
        // They provide a concise syntax for implementing functional interfaces

        try (var svc = Executors.newFixedThreadPool(3)) {

            Runnable r = new Runnable() {
                @Override
                public void run() {
                    System.out.println("[r] Hello from thread " + Thread.currentThread().getName());
                }
            };

            Runnable r2 = () -> {
                if (1 == 1) {
                    System.out.println("[r2] Hello from thread " + Thread.currentThread().getName());
                }
            };

            Runnable r1 = () -> System.out.println("[r1] Hello from thread " + Thread.currentThread().getName());

            svc.submit(r);
            svc.submit(r1);
            svc.submit(r2);
        }


        Comparator<Double> byPrice = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Double> byPrice2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(byPrice.compare(1.0, 2.0));
        System.out.println(byPrice2.compare(5.0, 2.0));



        Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        List<String> names = new ArrayList<>(List.of("Robert", "Ioana", "Cristina", "Victor"));
        Collections.sort(names, byLength);
        System.out.println(names);



        Comparator<String> alphabetical = (s1, s2) -> s1.compareTo(s2);
        Collections.sort(names, alphabetical);
        System.out.println(names);


    }
}
