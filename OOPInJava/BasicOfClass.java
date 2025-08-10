// This is a simple Java program demonstrating the use of classes, objects, and methods.

/*
    Class: 
    A blueprint for creating objects. It defines properties (attributes) and behaviors (methods).
    Real Time Example:
    Car can be considered a class, which defines properties like color and model, and behaviors like starting and stopping.

    Properties (Attributes) or Instance Variables:
    - Color: The color of the car (e.g., Red, Blue).
    - Model: The model of the car (e.g., TATA, Honda).

    Behaviors (Methods) or Instance Methods:
    - displayDetails(): A method to display the details of the car.


    Object:
    An instance of a class. It contains specific values for the properties defined in the class.
    Real Time Example:
    A specific car, like a red TATA car, is an object of the Car class.

    Static Method:
    A method that belongs to the class rather than any specific object. 
    It can be called without creating an instance of the class.
 
*/




class Car{

    // Instance variables
    String color;
    String model;

    // Instance method
    void displayDetails(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);  
    }
}


public class BasicOfClass{

    public static void display(){
        System.out.println("This is a static method in BasicOfClass.");
    }
    public static void main(String[] args){

        display();

//     Class object = new Class();        
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "TATA";

        // Calling the instance method
        myCar.displayDetails();
    }
}