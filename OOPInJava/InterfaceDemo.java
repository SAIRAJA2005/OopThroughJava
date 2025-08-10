/*
    * This file is part of the Java Programming Course.

 */


 interface Animal {
    // Abstract method to be implemented by subclasses
    void makeSound();
    void sound();
}

interface Pet {
    // Another abstract method
    void play();
}

// Dog class implements both Animal and Pet interfaces
class Dog implements Animal, Pet {

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    // is override is necessary here?
    // Yes, because play() is defined in the Pet interface
    // can we override without the @Override annotation?
    // Yes, but it's a good practice to use @Override for clarity

    @Override
    public void play() {
        System.out.println("Dog is playing!");
    }

    @Override
    public void sound() {
        System.out.println("Dog sound!");
    }

}
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
    @Override
    public void sound() {
        System.out.println("Cat sound!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        
        // Create instances of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call methods on Dog
        myDog.makeSound(); // Outputs: Woof!
        myDog.sound();     // Outputs: Dog sound!

        // Call methods on Cat
        myCat.makeSound(); // Outputs: Meow!
        myCat.sound();     // Outputs: Cat sound!

    }
}
