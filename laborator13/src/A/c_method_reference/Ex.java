package A.c_method_reference;

import java.util.function.Function;

public class Ex {
    public static void main(String[] args) {

        String name = "Test";
        String upper = name.toUpperCase();

        Function<String, Integer> length = (input) -> {
            return input.length();
        };

        Function<String, Integer> length2 = String::length;
        Function<String, String> toUpper = String::toUpperCase;

        Function<String, String> print = Ex::test;
        System.out.println(print.apply(upper));

        Function<Integer, Integer> sum = Ex::sum;
        System.out.println(sum.apply(5));
    }

    public static String test(String input) {
        return input.toUpperCase() + " " + input.length();
    }

    public static Integer sum(int a) {
        return a * 10;
    }
}
