package supraincarcare;

public class Ex {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        Integer a = 4;
        int b = 1;

        int c = Integer.valueOf(2);
        Integer d = (int) 2;

        System.out.println(mathOperations.multiply(a, b));

        System.out.println(mathOperations.multiply(22.f, 1));
        System.out.println(mathOperations.multiply(1, 2, 3));
        System.out.println(mathOperations.multiply(2, 4.2));
        System.out.println(mathOperations.multiply(1.23, 2.44, 6.41));

        Integer f = 5;
//        Integer -> double
        double g = f;
        System.out.println(" test " + g);
        mathOperations.multiply(f, 2.41d);
    }
}
