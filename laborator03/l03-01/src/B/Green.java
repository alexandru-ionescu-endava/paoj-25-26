package B;

import A.Blue;

public class Green
        extends Blue {

    public static void main(String[] args) {
        Green green = new Green();
        green.age = 25;
//        System.out.println(green.firstName); // private
        System.out.println(green.age); // protected
        System.out.println(green.lastName); // public
//        System.out.println(green.height); // default
    }
}
