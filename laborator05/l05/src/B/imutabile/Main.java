package B.imutabile;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");

        System.out.println(car1.getBrand());

//         car1.brand = "Honda"; // Eroare de compilare
//        nu am setter
    }
}
