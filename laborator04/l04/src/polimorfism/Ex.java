package polimorfism;

public class Ex {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

//        upcasting
        Animal dog = new Dog();
        dog.eat();
//        dog.bark();

//        downcasting
        Dog d = null;
        if (dog instanceof Dog) {
            d = (Dog) dog;
            d.eat();
            d.bark();
        }

        System.out.println(dog.getClass());
        Animal b = new Labrador();

        var unknow = new Labrador();
        System.out.println(unknow.getClass());
    }
}
