package A;

public class Yellow {

    public static void main(String[] args) {
        Blue blue = new Blue();
//        System.out.println(blue.firstName); // private
        System.out.println(blue.age); // protected
        System.out.println(blue.lastName); // public
        System.out.println(blue.height); // default
    }
}
