package A.lifecycle;

public class Ex {

    public static void main(String[] args) throws InterruptedException {

        Telefon telefon = new Telefon(
                "Apple",
                "iPhone 14 Pro Max"
        );
        Telefon t2 = telefon;

        System.out.println(t2 == telefon);
        telefon = new Telefon(
                "Samsung",
                "Galaxy S23 Ultra"
        );
        System.out.println(t2 == telefon);

        t2 = null;
        telefon = null;

        System.gc();
        Thread.sleep(500);
    }
}
