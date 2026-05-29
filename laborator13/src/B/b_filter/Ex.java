package B.b_filter;

import java.util.List;

public class Ex {
    public static void main(String[] args) {

        // filter(Predicate): keep only matching elements
        List<Double> transactions = List.of(-50.0, 25.0, 100.0, -12.0, 250.0);

        List<Double> credits = transactions.stream()
                .filter(amount -> amount > 0)
                .toList();

        System.out.println(credits);

        List<Integer> numbers = List.of(2, 2, 2, 4, 3);

        long result = numbers.stream()
                .peek(System.out::println)
                .filter(number -> number % 2 == 0)
                .count();

        System.out.println(result);
    }
}
