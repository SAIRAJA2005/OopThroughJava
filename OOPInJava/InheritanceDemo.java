/*
 * InheritanceDemo.java
 * This program demonstrates inheritance in Java.
 * There are different types of inheritance, such as single, multiple, and hierarchical.
 * Single inheritance is shown here, where a child class inherits from a parent class.
 * The parent class can have methods that are inherited by the child class.
 * The child class can also have its own methods that are not inherited from the parent class.
 * The child class can access the methods of the parent class using the 'super' keyword.
 */



class Animal {

    private String name = "Animal"; // Private field, not accessible in child classes
    protected int age = 10; // Protected field, accessible in child classes
    String species = "Dog"; // Default access modifier, accessible within the same package
    public String color; // Public field, accessible everywhere



    // Method in the parent class
    // This method can be inherited by child classes
    void eat() {
        System.out.println("Hey i am the " + species + "species");
        System.out.println("Hey i am Eating...");
    }

    void sleep() {
        System.out.println("Hey i am Sleeping...");
    }
}

class Dog extends Animal {
    // Method in the child class
    // This method is specific to Dog and not inherited from Animal
    void bark() {

        
        
        System.out.println("Barking...");
        
        // sleep.method is inherited from Animal class
        // we can also call from the other than first line also
        super.sleep(); // Calling the inherited method from Animal
        
        System.out.println(age); // Accessing protected field from parent class

    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited method
        d.bark();
    }
}
