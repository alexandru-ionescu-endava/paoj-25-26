import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        forLoops();
        packageUsageExample();
    }

    private static void forLoops() {

//        int[] a = {1, 2, 3, 4, 5};
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//
//        for (int i : a) {
//            System.out.println(i);
//        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (var i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int[] b = {1, 0, 3, 2, 5, 4};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        int[] c = new int[4];
        for (int i = 0; i < c.length; i++) {
            c[i] = i + 1;
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.size());
        list.add(2);

        System.out.println(list.size());
        list.add(3);
    }

    private static void whileLoops() {
        int a = 10;

        while (a > 0) {
            System.out.println(a);
            a--;
        }

        System.out.println("===");

        do {
            if (a == 3)
                break;

            System.out.println(a);
            a++;
        } while (a < 8);

        System.out.println("===");

        do {
            if (a == 3) {
                a++;
                continue;
            }

            System.out.println(a);
            a++;
        } while (a < 8);
    }

    private static void ifStatetements() {
        int a = 2;

        if (a > 10)
            System.out.println("a is greater than 10");
        else
            System.out.println("a is less than or equal to 10");

        if (a > 10) {
            System.out.println("a is greater than 10");
        } else {
            System.out.println("a is less than or equal to 10");
        }

        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("a is positive and even");
            } else {
                System.out.println("a is positive and odd");
            }
        }

        int b = 50;
        if (a > 10 && b < 100 || a == 2) {
            System.out.println("a is greater than 10 and b is less than 100");
        }

        int c = a > 10
                ? 100
                : 200; // ternary operator - operator ternar

        System.out.println(c);
    }

    private static void packageUsageExample() {
        test.Integer integer = new test.Integer();
        integer.test();

        Integer integer2 = 10;
        System.out.println(integer2);
    }

    private static void ranges() {
        System.out.println(Boolean.FALSE + " " + Boolean.TRUE);
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

//        /Library/Java/JavaVirtualMachines/jdk-21.0.2.jdk/Contents/Home!/java.base/java/lang/Integer.class
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE);
        System.out.println(Character.MIN_VALUE + " " + Character.MAX_VALUE);
    }

    private static void boxingUnboxing() {
        int a = 10;

//        boxing - conversia unui tip de date primitiv intr-un tip de date de referinta
        Integer aWrapper = Integer.valueOf(a);
        Integer aWrapper2 = a; // autoboxing - conversia automata a unui tip de date primitiv intr-un tip de date de referinta

        int unboxedA = aWrapper.intValue();
        int unboxedA2 = aWrapper; // unboxing - conversia automata a unui tip de date de referinta intr-un tip de date primitiv

        System.out.println(a + " " + aWrapper + " " + aWrapper2 + " " + unboxedA + " " + unboxedA2);
    }

    private static void tipuriDeDate() {

//        tipuri de date primitive
//        stored on the stack (stiva)

        boolean isRunning = true;
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40L;
        float e = 50.5f;
        double f = 60.5;
        char g = 'A';
        String h = "Hello, World!";

//        reference types (tipuri de date de referinta)
//        stored on the heap (heap)
        Boolean isRunning2 = Boolean.TRUE;
        Byte a2 = 10;
        Short b2 = 20;
        Integer c2 = 30;
        Long d2 = 40L;
        Float e2 = 50.5f;
        Double f2 = 60.5;
        Character g2 = 'A';

        Integer c3 = null; // reference type can be null
    }
}
