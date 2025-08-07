package oop; // Declares that this class is part of the 'oop' package

// Base class definition
class base {
    int x; // Instance variable x

    // Getter method for x
    public int getX() {
        return x;
    }

    // Setter method for x
    public void setX(int x) {
        this.x = x;
    }
}

// Derived class that inherits from base
class derived extends base {
    int y; // Instance variable y

    // Getter method for y
    public int getY() {
        return y;
    }

    // Setter method for y
    public void setY(int y) {
        this.y = y;
    }
}

// Main class to demonstrate inheritance
public class inheritance {
    public static void main(String[] args) {
        
        // Creating an object of base class
        base b = new base(); // Object 'b' of type base
        b.setX(4);           // Setting value of x using setter method
        System.out.println(b.getX()); // Getting and printing value of x

        // Creating an object of derived class
        derived d = new derived(); // Object 'd' of type derived
        d.setX(40);               // Setting value of inherited x using base class method
        System.out.println(d.getX()); // Getting and printing value of inherited x
    }
}
