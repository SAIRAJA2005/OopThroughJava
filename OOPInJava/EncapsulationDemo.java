// Parent class with encapsulated fields
class Person {

    // Private field - NOT accessible directly by subclasses
    private int age;

    // Protected field - accessible by subclasses directly
    protected String name;

    // Getter for private field 'age'
    public int getAge() {
        return age;
    }

    // Setter for private field 'age'
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}

// Subclass trying to access fields
class Employee extends Person {

    void showDetails() {
        // Can access protected field directly
        name = "Alice";

        // Cannot access private field directly - below line would cause a compile error:
        // age = 30; // ERROR: age has private access in Person

        // Must use public setter to change private field 'age'
        setAge(30);

        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.showDetails();
    }
}
