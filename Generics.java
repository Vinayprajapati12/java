package endOfJava;

import java.util.ArrayList;
import java.util.Scanner;

// A generic class that works with any data type (T1 represents a type placeholder)
class MyGenerics<T1> {

    // Instance variables
    int val;      // Holds an integer value
    private T1 t1; // Holds a generic type value (can be String, Integer, etc.)

    // Getter method for 'val'
    public int getVal() {
        return val;
    }

    // Setter method for 'val'
    public void setVal(int val) {
        this.val = val;
    }

    // Getter method for generic type 't1'
    public T1 getT1() {
        return t1;
    }

    // Setter method for generic type 't1'
    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    // Constructor to initialize 'val' and 't1'
    public MyGenerics(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }
}

public class javaGenerics {
    public static void main(String[] args) {

        // Creating an ArrayList that will only store Integer values
        ArrayList<Integer> arrayList = new ArrayList();

        // Adding integer elements to the ArrayList
        arrayList.add(54);
        arrayList.add(643);

        // ❌ This would cause an error because ArrayList<Integer> only accepts Integers
        // arrayList.add("str1");
        // arrayList.add(new Scanner(System.in));

        // Trying to access element at index 2 (⚠️ This will throw IndexOutOfBoundsException)
        int a = (int) arrayList.get(2); 
        System.out.println(a);

        // Creating a generic object with T1 as String
        MyGenerics<String> g1 = new MyGenerics<>(23, "MyString is my String");

        // Getting the String value from g1
        String str = g1.getT1();
        System.out.println(str);
    }
}
