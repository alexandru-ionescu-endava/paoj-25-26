package A.d_most_common;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex {

    public static void main(String[] args) {

        Predicate<Integer> isEven = (number) -> number % 2 == 0;

        Predicate<Integer> isOdd = (number) -> number % 2 != 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false

        BiPredicate<Integer, Integer> isDivisible = (a, b) -> a % b == 0;
        System.out.println(isDivisible.test(10, 2)); // true
        System.out.println(isDivisible.test(10, 3)); // false


        Function<String, Integer> stringLength = (str) -> str.length();
        System.out.println(stringLength.apply("Hello")); // 5
        System.out.println(stringLength.apply("Functional Interface")); // 20

        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + " " + str2;
        System.out.println(concatenate.apply("Hello", "World")); // "Hello World"

        BiFunction<String, Integer, String> repeatString = (str, times) -> str.repeat(times);
        System.out.println(repeatString.apply("Hi", 3)); // "HiHiHi



        Consumer<String> printUpperCase = (str) -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello world"); // prints "HELLO WORLD"

        BiConsumer<String, String> printString = (str1, str2) -> System.out.println(str1 + str2);
        printString.accept("Hello ", "Java"); // prints "Hello Java"



        Supplier<String> randomStringSupplier = () -> "RandomString" + (int) (Math.random() * 100);
        System.out.println(randomStringSupplier.get()); // prints a random string like "RandomString42"



        // for unary operator, the input and output types are the same
        UnaryOperator<String> toLowerCase = (str) -> str.toLowerCase();
        System.out.println(toLowerCase.apply("HELLO WORLD")); // prints "hello world"

        // binary operator is a special case of bi-function where the input and output types are the same
        BinaryOperator<Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(5, 10)); // prints 15

    }
}
