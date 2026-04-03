package math.C;

public class Ex {
    public static void main(String[] args) {

        GenericFunction addition = new GenericFunction() {
            @Override
            public double apply(double x, double y) {
                return x + y;
            }
        };

        GenericFunction subtraction = new GenericFunction() {
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

        MathOperation mathOperation = new MathOperation() {

            @Override
            public double applyGenericFunction(GenericFunction genericFunction, double a, double b) {
                return genericFunction.apply(a, b);
            }

            @Override
            public void applyGenericFunctionWithCallback(GenericFunction genericFunction, double a, double b, CallbackFunction callback) {
                double result = genericFunction.apply(a, b);

                callback.onComplete(result);
            }

        };

        double result = mathOperation.applyGenericFunction(addition, 5, 3);
        System.out.println(result);

        result = mathOperation.applyGenericFunction(subtraction, 5, 3);
        System.out.println(result);

        result = mathOperation.applyGenericFunction(pow, 5, 0);
        System.out.println(result);

        System.out.println("===");

        mathOperation.applyGenericFunctionWithCallback(addition, 10, 20, callback);

    }
}
