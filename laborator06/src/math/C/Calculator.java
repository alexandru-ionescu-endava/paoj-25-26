package math.C;

public class Calculator
        implements MathOperation {

    @Override
    public double applyGenericFunction(GenericFunction genericFunction, double a, double b) {
        return genericFunction.apply(a, b);
    }

    @Override
    public void applyGenericFunctionWithCallback(GenericFunction genericFunction,
                                                   double a,
                                                   double b,
                                                   CallbackFunction callback) {

        double result = genericFunction.apply(a, b);

        callback.onComplete(result);
    }

}
