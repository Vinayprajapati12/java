package oop;

// Employee class with private variables (Encapsulation)
class myMainEmplyoee {
    private int id;
    private String name;

    // Default constructor (no parameters)
    public myMainEmplyoee() {
        id = 89;
        name = "vinay";
    }

    // Parameterized constructor
    public myMainEmplyoee(int i, String myName) {
        id = i;
        name = myName;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String n) {
        this.name = n;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }
}

// Main class to run the program
public class constructors {
    public static void main(String[] args) {

        // Creating object using parameterized constructor
        myMainEmplyoee vinay = new myMainEmplyoee(33, "vinay");

        // You can also set values like this (commented)
        // vinay.setName("codewithvinay");
        // vinay.setId(33);

        // Printing values using getter methods
        System.out.println(vinay.getId());     // Output: 33
        System.out.println(vinay.getName());   // Output: vinay
    }
}
