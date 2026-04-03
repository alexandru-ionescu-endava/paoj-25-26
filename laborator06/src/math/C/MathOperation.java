package math.C;

public interface MathOperation {

    double applyGenericFunction(GenericFunction genericFunction, double a, double b);

    void applyGenericFunctionWithCallback(GenericFunction genericFunction,
                                          double a,
                                          double b,
                                          CallbackFunction callback);
}
