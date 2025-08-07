package oop; // Package name

// Parent class A
class A {
    public int a; // Variable

    public int vinay() { // Method returning 4
        return 4;
    }

    public void meth2() { // Method of class A
        System.out.println("I am method 2 of class A");
    }
}

// Child class B inherits A
class B extends A {

    @Override
    public void meth2() { // Overriding meth2 from A
        System.out.println("I am method 2 of class B");
    }

    public void meth3() { // New method in B
        System.out.println("I am method 3 of class B");
    }
}

// Main class
public class methodOverriding {
    public static void main(String[] args) {

        A a = new A(); // Object of class A
        a.meth2();     // Calls A's meth2

        B b = new B(); // Object of class B
        b.meth2();     // Calls B's meth2

        // A ref = new B(); // Uncomment to test polymorphism
        // ref.meth2();     // Calls B's meth2
    }
}

/*
output

I am method 2 of class A
I am method 2 of class B

*/
