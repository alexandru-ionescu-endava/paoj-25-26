package math.C;

public class Ex2 {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        GenericFunction add = new GenericFunction() {
            @Override
            public double apply(double x, double y) {
                return x + y;
            }
        };

        GenericFunction sub = new GenericFunction() {
            @Override
            public double apply(double x, double y) {
                return x - y;
            }
        };

        GenericFunction pow = new GenericFunction() {
            @Override
            public double apply(double x, double y) {
                return Math.pow(x, y);
            }
        };

        CallbackFunction callback = new CallbackFunction() {
            @Override
            public void onComplete(double result) {
                System.out.println("Callback: Result is " + result);
            }
        };

        double result = calculator.applyGenericFunction(add, 5, 3);
        System.out.println(result);

        calculator.applyGenericFunctionWithCallback(add, 5, 3, callback);
        calculator.applyGenericFunctionWithCallback(pow, -856245, 0, callback);

    }
}
