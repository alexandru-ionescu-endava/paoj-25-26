package A.a_functional_interface;

public class Ex {
    public static void main(String[] args) {

        Discount studentDiscount = new Discount() {
            @Override
            public double apply(double price) {
                return price * 0.2;
            }
        };

        System.out.println("Student Discount on $100: " + studentDiscount.apply(100));


        Discount loyaltyDiscount = (price) -> {
            if (price > 200) {
                return price * 0.15;
            } else {
                return price * 0.1;
            }
        };
        System.out.println("Loyalty Discount on $150: " + loyaltyDiscount.apply(150));


        Discount blackFridayDiscount = price -> price * 0.5;
        System.out.println("Black Friday Discount on $300: " + blackFridayDiscount.apply(300));
    }
}
