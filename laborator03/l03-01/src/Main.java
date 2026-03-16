import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a[] = new int[10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        System.out.println(Arrays.toString(a));

        Integer[] a1 = new Integer[10];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        System.out.println(Arrays.toString(a1));
    }

    private static void ex1() {
        int a[] = new int[10];
        Integer[] a2 = new Integer[10];

        Arrays.fill(a, 1);
        System.out.println(Arrays.toString(a));
    }
}