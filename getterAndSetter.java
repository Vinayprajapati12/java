package oop;

/* Shortcut for getter and setter :
 three dot -> code -> generate -> getter and setter */

class stud {
    // private variables (encapsulation)
    private int roll;
    private String name;

    // getter for roll
    public int getRoll() {
        return roll;
    }

    // setter for roll
    public void setRoll(int n) {
        this.roll = n;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String n) {
        this.name = n;
    }
}

public class setGet {
    public static void main(String[] args) {
        // create object
        stud st = new stud();

        // set values
        st.setRoll(89);
        st.setName("vinay");

        // get and print values
        System.out.println("Roll Number: " + st.getRoll());
        System.out.println("Student Name: " + st.getName());
    }
}
