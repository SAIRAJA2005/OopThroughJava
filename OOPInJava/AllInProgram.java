/*
 * Scenario: Airport Bird Tracking System
 * I built a small airport bird tracking system where Animal is an abstract class 
 * — because all animals have common properties like a name, but each makes a different sound, 
 * so makeSound is abstract. Bird extends Animal and implements Flyable because not all animals fly, 
 * but birds in this system do.I used a static nested class (BirdHelper) to store shared environmental info, 
 * like planet data from a final Constants class. I also added an inner class (Wing) to model a part of the bird.
 * overrode toString, equals, and hashCode so birds can be compared and printed properly. 
 * This makes it more maintainable and follows good OOP design principles
 */

// Interface for all flying creatures
interface Flyable {
    void fly(); // behavior for flying
}

// Abstract class for all animals at the airport
abstract class Animal {
    private String name; // Encapsulation

    Animal(String name) {
        this.name = name;
    }

    public String getName() { 
        return name; 
    }

    // Abstract method: every animal sounds different
    public abstract void makeSound();

    // Object class methods overridden
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Same memory location? They are the same object
        if (this == obj) {
            return true;
        }
    
        // Is the other object NOT an Animal? Then they can't be equal
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
    
        // Now we know obj is an Animal — safe to cast
        // Take obj (which is of type Object) and treat it as an Animal
        Animal other = (Animal) obj;
    
        // Compare the names (null-safe)
        return name != null && name.equals(other.name);
    }
    

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

// Final class: constants for the airport tracking system
final class Constants {
    static final String PLANET = "Earth";
}

// Concrete bird class for airport tracking
class Bird extends Animal implements Flyable {

    // Static nested class — Airport info shared for all birds
    static class BirdHelper {
        static void printPlanet() {
            System.out.println("Birds live on " + Constants.PLANET);
        }
    }

    Bird(String name) {
        super(name); // super() calls parent Animal constructor
    }

    @Override
    public void makeSound() {
        // here the getName method is used from Animal class
        System.out.println(getName() + " chirps loudly!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying above the runway!");
    }

    // Inner class — part of a bird
    class Wing {
        void flap() {
            System.out.println(getName() + "'s wings are flapping fast!");
        }
    }
}

// Main airport monitoring program
public class AllInProgram {
    public static void main(String[] args) {

        // Two birds spotted
        Bird sparrow1 = new Bird("Sparrow");
        Bird sparrow2 = new Bird("Sparrow");

        // Animal sounds for species recognition
        sparrow1.makeSound();

        // Track bird flight behavior
        sparrow1.fly();

        // Planet info — same for all birds
        // BirdHelper is a static nested class, so we can call it without an instance
        Bird.BirdHelper.printPlanet();

        // Research wing flapping
        // Using the inner class Wing to model bird's wing behavior
        // Create an instance of the inner class Wing
        Bird.Wing wing = sparrow1.new Wing();
        wing.flap();

        // Logging bird info
        System.out.println(sparrow1); // toString()
        System.out.println("Are these the same species? " + sparrow1.equals(sparrow2));
        System.out.println("Bird hash code: " + sparrow1.hashCode());

        // Final constant
        System.out.println("Tracked on planet: " + Constants.PLANET);
    }
}

