package oop; // Package name

// Base class
class base1 {
    base1() {
        System.out.println("I am a base class constructor");
    }

    base1(int x) {
        System.out.println("I am an overloaded constructor with value of a as: " + x);
    }
}

// Derived class extending base1
class derived1 extends base1 {

    derived1() {
        // super() is called implicitly here
        System.out.println("I am a derived class constructor");
    }

    derived1(int x, int y) {
        super(x); // Call base1's parameterized constructor
        System.out.println("I am an overloaded constructor of derived with value of y as: " + y);
    }
}

// Child class of derived1
class childOfDerived extends derived1 {

    childOfDerived() {
        System.out.println("I am a child of derived constructor");
    }

    childOfDerived(int x, int y, int z) {
        super(x, y); // Call derived1's constructor
        System.out.println("I am an overloaded constructor of derived with value of z as: " + z);
    }
}

// Main class to test constructor chaining
public class constructorInInheritance {
    public static void main(String[] args) {
        // Create object using 3-argument constructor
        childOfDerived cd = new childOfDerived(12, 13, 14);
    }
}

/*
output
I am an overloaded constructor with value of a as: 12
I am an overloaded constructor of derived with value of y as: 13
I am an overloaded constructor of derived with value of z as: 14
*/
