package oop;

// Abstract class
abstract class parent {
    // Constructor
    public parent() {
        System.out.println("mai parent ka constructor hu");
    }

    // Regular method
    public void sayHello() {
        System.out.println("hello");
    }

    // Abstract method
    abstract public void greet();
}

// Concrete subclass
class child extends parent {
    // Implement abstract method
    @Override
    public void greet() {
        System.out.println(" good morning");
    }
}

// Abstract subclass (doesn't implement greet)
abstract class child3 extends parent {
    public void th() {
        System.out.println("hi");
    }
}

// Main class
public class abstractClass {
    public static void main(String[] args) {
        child c = new child();  // Valid

        // parent p = new parent(); // ❌ Error: can't create object of abstract class
    }
}
