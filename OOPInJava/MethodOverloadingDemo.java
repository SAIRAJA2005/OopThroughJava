/*
 * This code demonstrates method overloading in Java.
 * Method overloading allows multiple methods in the same class to have the same name but different parameter lists.
 * This is useful for performing similar operations with different types of inputs.
 * It enhances code readability and allows for more flexible method calls.
 */


class Calculator{
    // Method overloading: same method name with different parameter types
    int add(int a, int b){
        return a + b;
    }

    // Overloaded methods with different parameter types
    double add(double a, double b){
        return a + b;
    }
    
    // Overloaded method for String concatenation
    String add(String a, String b){
        return a + b;
    }
}


public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10, 20));
        System.out.println(cal.add(10.5, 20.5));
        System.out.println(cal.add("Hello, ", "World!"));
    }
}

