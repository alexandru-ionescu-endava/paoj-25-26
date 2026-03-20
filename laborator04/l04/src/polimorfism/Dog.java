package polimorfism;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    public void bark() {
        System.out.println("Bark");
    }
}
