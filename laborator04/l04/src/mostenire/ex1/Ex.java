package mostenire.ex1;

public class Ex {
    public static void main(String[] args) {

        Device device = new Device(
                "test",
                1.2,
                "test1",
                "serialNo1"
        );

        Phone phone = new Phone(
                "test1",
                2.4,
                "test",
                "serialNo2"
        );


        System.out.println(phone.getName());
        System.out.println(phone.getModel());
        System.out.println(phone.getPrice());
        System.out.println(phone.getSerialNumber());

        Phone phone2 = new Phone();
        phone2.makeCall();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall();

        SmartPhone2 smartPhone2 = new SmartPhone2();
        smartPhone2.makeCall();
    }

    void ex1() {
        Device device = new Device();
        device.model = "test";
        device.serialNumber = "test";
        device.price = 1.0;

        Phone phone = new Phone();
        phone.model = "test";
        phone.price = 1.0;
        phone.serialNumber = "test";
    }
}
