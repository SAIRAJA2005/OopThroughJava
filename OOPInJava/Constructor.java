/*
    -> This code demonstrates the use of constructors in Java.
    -> It includes a default constructor and a parameterized constructor.
    -> The 'this' keyword is used to refer to the current instance of the class.
    -> Constructors are special methods that are called when an object is created.
    -> The code also demonstrates constructor overloading, where multiple constructors can exist with different parameters.
*/



class ElectronicDevice{

    // Attributes
    String name;
    double price;

    // default constructor
    ElectronicDevice(){

        // This constructor initializes the attributes with default values.

        name = "Unknown Device";
        price = 0.0;

        System.out.println("Default constructor called.");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    // Parameterized constructor
    ElectronicDevice(String name, double price){

        /*
            -> This constructor initializes the attributes with the provided values.
            -> this :
                =>> The 'this' keyword is used to refer to the current instance of the class.
                =>> It is used to distinguish between instance variables and parameters.           
         */
        this.name = name;
        this.price = price;

        System.out.println("Parameterized constructor called.");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    // Constructor Overloading 
    ElectronicDevice(String name) {
        this.name = name;
        this.price = 20000.0; // Default price
        System.out.println("Overloaded constructor called.");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

}

public class Constructor {
    public static void main(String[] args) {
        
        // Create an instance of the class
        ElectronicDevice device = new ElectronicDevice();

        // Create another instance using the parameterized constructor
        ElectronicDevice secondDevice = new ElectronicDevice("Smartphone", 699.99);

        // Create another instance using the overloaded constructor
        ElectronicDevice thirdDevice = new ElectronicDevice("Laptop");

        new Bus("Tata");
    }
}
