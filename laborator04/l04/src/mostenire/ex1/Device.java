package mostenire.ex1;

public class Device {

    private String name;
    protected double price;
    String model;
    public String serialNumber;

    public Device(String name, double price, String model, String serialNumber) {
        this.name = name;
        this.price = price;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public Device() {
    }

    public void test() {
        System.out.println("test() from Device");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
