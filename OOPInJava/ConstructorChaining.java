/*
    * This code demonstrates constructor chaining in Java.
    * when subclass calls the parent class constructor, it uses `super()`.
    * When the subclass has its own constructor, it can call another constructor of the same class using `this()`.
    * Simply , super() is for calling the parent class constructor, and this() is for calling another constructor in the same class.
 */



class Vehicle {

    Vehicle(String name) {
        System.out.println("Vehicle: " + name);
    }
}

class Car extends Vehicle {
    Car() {
        this("BMW"); // calls Car(String)
        System.out.println("Car default constructor");
    }
    Car(String brand) {
        super(brand); // calls Vehicle(String)
        System.out.println("Car parameterized constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Car firstCar = new Car();
    }
}
