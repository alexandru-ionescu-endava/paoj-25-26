package A.basics;

public class Ex {
    public static void main(String[] args) {

        String input = null;
        try {
            Double d = Double.parseDouble(input);
            System.out.println(d);
        } catch (NullPointerException e) {
            System.out.println("npe");
        } catch (NumberFormatException e) {
            System.out.println("nfe");
        } catch (RuntimeException e) {
            System.out.println("runtime");
        }

        System.out.println("am ajuns la final");


    }
}
