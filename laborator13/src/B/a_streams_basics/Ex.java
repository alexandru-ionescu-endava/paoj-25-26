package B.a_streams_basics;

import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex {
    public static void main(String[] args) {

        // imperative approach
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);


        // intstream is a stream of primitive int values. It provides various methods to perform operations on the stream, such as map, filter, reduce, etc.
        // functional approach with streams
        int sum2 = IntStream.range(0, 5).sum();
        System.out.println("Sum with streams: " + sum2);

        IntStream.range(0, 5)
                .map(elem -> elem * elem)
                .forEach(System.out::println);

        Stream<Integer> stream = IntStream.range(0, 5).boxed();

        Consumer<Integer> consumer = (elem) -> System.out.println("Element: " + elem);

        stream.forEach(consumer);


    }
}
