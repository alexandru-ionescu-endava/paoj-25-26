package C;

import A.Yellow;

public class PersonExample {

    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 30);
//        System.out.println(person.firstName); // private

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

        System.out.println(person);

        System.out.println("===");
        System.out.println(person.getLastName().hashCode());

        Person person1 = new Person("Jane", "Doe", 28);
        System.out.println(person1.getLastName().hashCode());


        System.out.println(person1 instanceof Object);

        System.out.println(person == person1);
        System.out.println(person.equals(person1));

//        System.out.println(person1 instanceof Yellow);
//        Person and Yellow are unrelated types; instanceof requires type compatibility.

    }
}
