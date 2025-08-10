/*
 * This Java program demonstrates method overriding.
 * The `Animal` class has a method `sound()`,
 * which is overridden in the `Dog` class.
 * When the `sound()` method is called on an instance of `Dog`,
 * it executes the overridden method in `Dog`.

 */



class Animal{

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();
    }
}
