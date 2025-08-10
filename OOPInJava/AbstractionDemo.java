/*
 * Abstraction in Java
 * Abstraction is a fundamental concept in object-oriented programming that allows you to 
 * hide the complex implementation details and show only the essential features of an object.
 
 * In Java, abstraction can be achieved using abstract classes and interfaces. 
 * Supports inheritance — a class can extend only one abstract class.
 * Used when classes share common behavior AND a common .
 

 * Multiple classes can extend the same abstract class.
 * But you cannot create an instance of an abstract class directly.
 * It doesn't allow multiple inheritance, which means a class cannot extend more than one abstract class.
 */

 abstract class Vehicle {
    abstract void start(); // You only care that it starts
}

class Car extends Vehicle{ 
    @Override
    void start() {
        checkBattery();
        fuelInjection();
        igniteEngine();
        System.out.println("Car started successfully!");
    }

    private void checkBattery() {
        System.out.println("Checking battery voltage...");
    }

    private void fuelInjection() {
        System.out.println("Injecting fuel...");
    }

    private void igniteEngine() {
        System.out.println("Igniting engine...");
    }
}

class Bus extends Vehicle {
    @Override
    void start() {
        airBrakeCheck();
        System.out.println("Bus engine started with air pressure system.");
    }

    private void airBrakeCheck() {
        System.out.println("Checking air brake system...");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {

        // You cannot create an instance of an abstract class
        // Uncommenting the next line will cause a compilation error

        // Vehicle v = new Vehicle();

        Vehicle myCar = new Car();
        myCar.start();  // hides all complex steps inside Car

        Vehicle myBus = new Bus();
        myBus.start();  // hides bus-specific start sequence
    }
}

