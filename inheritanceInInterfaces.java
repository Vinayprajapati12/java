package oop;

// Parent interface
interface sampleInterface {
    void meth1(); // method 1
    void meth2(); // method 2
}

// Child interface extends parent
interface childSampleInterface extends sampleInterface {
    void meth3(); // method 3
    void meth4(); // method 4
}

// Class implements child interface
class mySampleClass implements childSampleInterface {
    public void meth1() { System.out.println("meth1"); }
    public void meth2() { System.out.println("meth2"); }
    public void meth3() { System.out.println("meth3"); }
    public void meth4() { System.out.println("meth4"); }
}

public class inheritanceInInterfaces {
    public static void main(String[] args) {
        mySampleClass obj = new mySampleClass(); // create object
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}


/* 
outputmeth1
meth2
meth3
meth4
*/
