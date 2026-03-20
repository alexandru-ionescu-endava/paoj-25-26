package mostenire.ex2;

public class Ex {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal[] zoo = new Animal[3];
        zoo[0] = animal;
        zoo[1] = cat;
        zoo[2] = dog;

        for (Animal a : zoo) {
            a.eat();
        }
    }
}
