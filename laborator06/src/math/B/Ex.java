package math.B;

public class Ex {
    public static void main(String[] args) {

        MathOperation mathOperation = new MathOperation() {

            @Override
            public double applyFunction(double a, double b) {
                return Math.pow(a, b);
            }

            @Override
            public double divide(double a, double b) {
                return a / b;
            }

            @Override
            public double multiply(double a, double b) {
                return a * b;
            }
        };

        double result = mathOperation.applyFunction(1142242410, 0);
        System.out.println(result);

        result = mathOperation.divide(10, 2);
        System.out.println(result);

        result = mathOperation.multiply(10, 2);
        System.out.println(result);
    }
}
