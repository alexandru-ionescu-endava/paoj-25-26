import java.util.Arrays;

public class OOP1 {

    public static void main(String[] args) {

        class Car {
            String brand;
            int speed;
            static int nrOfCars;

            Car(String brand, int speed) {
                nrOfCars++;
                this.brand = brand;
                this.speed = speed;
            }

            Car() {
                this("Unknown", 0);
            }
        }

        Car car = new Car();
        System.out.println(car.brand + " " + car.speed);

        Car c2 = new Car("Toyota", 100);
        System.out.println(c2.brand + " " + c2.speed);

        System.out.println(Car.nrOfCars);
    }

    private static void ex6() {
        class Car {
            String brand;
            int speed;

            Car(String brand, int speed) {
                this.brand = brand;
                this.speed = speed;
            }

            Car() {
                this.brand = "Unknown";
                this.speed = 0;
            }

            Car(String brand) {
                this.brand = brand;
                this.speed = 150;
            }

            Car(int speed) {
                if (speed < 0) {
                    this.speed = 0;
                } else {
                    this.speed = speed;
                }
            }
        }

        Car car = new Car("Toyota", 100);
        System.out.println(car.brand + " " + car.speed);

        Car c2 = new Car();
        System.out.println(c2.brand + " " + c2.speed);

        Car c3 = new Car("Honda");
        System.out.println(c3.brand + " " + c3.speed);

        Car c4 = new Car(-50);
        System.out.println(c4.brand + " " + c4.speed);

        Car c5 = new Car(200);
        System.out.println(c5.brand + " " + c5.speed);
    }

    private static void ex5() {
        class Car {
            String brand;
            int speed;
            final static String ENGINE_TYPE = "Ford";

            {
                System.out.println("Car created");
                brand = "BMW";
                speed = 1;

            }

            static {
                System.out.println("Car class loaded");
            }
        }

//        will result in a compile-time error because ENGINE_TYPE is a final variable and cannot be reassigned
//        System.out.println(Car.ENGINE_TYPE = "Mercedes");
    }

    private static void ex4() {
        class Car {
            String brand;
            int speed;
            static String engineType = "Ford";

            {
                System.out.println("Car created");
                brand = "BMW";
                speed = 1;

            }

            static {
                System.out.println("Car class loaded");
            }
        }


        System.out.println(Car.engineType = "Mercedes");
    }

    private static void ex3() {
        class Car {
            final int[] a = new int[10];
        }

        Car car = new Car();
        car.a[0] = 1;
        System.out.println(car.a[0]);
        car.a[0] = 1;
    }

    private static void ex2() {
        class Car {
            final String brand = "BMW";
            int speed;
        }

        Car c1 = new Car();
        c1.speed = 1;
//        c1.brand = "Mercedes"; // Error: cannot assign a value to final variable brand

        Car c2 = new Car();
        c2.speed = 1;

        final Car c3 = new Car();
        c3.speed = 1;

//        c3 = new Car(); // Error: cannot assign a value to final variable c3
    }

    private static void ex1() {
        class Car {
            String brand;
            int speed;
        }

        Car c1 = new Car();
        c1.brand = "BMW";
        c1.speed = 1;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.speed = 1;

        System.out.println(c1.brand + " " + c1.speed);
        System.out.println(c2.brand + " " + c2.speed);

        System.out.println(c1 == c2);
    }
}
