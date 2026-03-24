package A.lifecycle;

public class Telefon {

    private String brand;
    private String model;

    public Telefon(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Telefon " + brand + " " + model + " is being garbage collected");
    }
}
