package A.lifecycle;

public class Ex2 {
    public static void main(String[] args) {

        for (int i = 0; i < 50_000_000; i++) {
            Telefon telefon = new Telefon(
                    "Brand" + i,
                    "Model" + i
            );
            if (i % 500_000 == 0) {
                System.out.println("Created " + (i + 1) + " phones");
                System.gc();
            }
        }
    }
}
