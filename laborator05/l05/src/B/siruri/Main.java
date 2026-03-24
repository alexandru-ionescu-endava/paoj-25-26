package B.siruri;

public class Main {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2));

        System.out.println("===");

        String s3 = new String("Hello");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String s4 = s3.intern();
        System.out.println(s1 == s4);

        String s5 = s1 + " World";
        System.out.println(s5);
        String s6 = s1 + s2 + " World";
        System.out.println(s6);

        String regex = "[a-zA-Z]+";
        System.out.println("Hello".matches(regex));
    }
}
