package mostenire.ex1;

public class Phone
        extends Device {

    public Phone(String name, double price, String model, String serialNumber) {
        super(name, price, model, serialNumber);
    }

    public Phone() {
        super("default", 0.0, "defaultModel", "default SN");
        super.test();
    }

    public void makeCall() {
        System.out.println("Default call");
    }

}
