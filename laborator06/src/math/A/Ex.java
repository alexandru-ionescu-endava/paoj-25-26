package math.A;

public class Ex {
    public static void main(String[] args) {

//        this is anonymous class, it is a class without a name, it is used to create an instance of an interface or an abstract class
        MathOperation mathOperation = new MathOperation() {

            @Override
            public double add(double a, double b) {
                return a + b;
            }

            @Override
            public double subtract(double a, double b) {
                return  a - b;
            }

            @Override
            public double multiply(double a, double b) {
                return a * b;
            }

            @Override
            public double divide(double a, double b) {
                return a / b;
            }
        };

        double result = mathOperation.add(10, 20);
        System.out.println(result);

        result = mathOperation.subtract(10, 20);
        System.out.println(result);

        result = mathOperation.multiply(10, 20);
        System.out.println(result);

        result = mathOperation.divide(10, 20);
        System.out.println(result);

        System.out.println(mathOperation.getClass());

    }
}
