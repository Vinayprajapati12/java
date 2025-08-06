// Package name (optional, depending on your project structure)
package oop;

// Define the class 'stud' (short for student)
class stud {

    // 🔒 Encapsulated variables - declared private
    private int roll;
    private String name;

    // ✅ Getter method for 'roll' - used to access private 'roll'
    public int getRoll() {
        return roll;
    }

    // ✅ Setter method for 'roll' - used to set a value to private 'roll'
    public void setRoll(int n) {
        this.roll = n;  // 'this' refers to the current object's variable
    }

    // ✅ Getter method for 'name' - returns the value of private 'name'
    public String getName() {
        return name;
    }

    // ✅ Setter method for 'name' - sets the value of private 'name'
    public void setName(String n) {
        this.name = n;
    }
}

// Public class containing the main method
public class setGet {
    public static void main(String[] args) {

        // 🧑‍🎓 Create an object of the 'stud' class
        stud st = new stud();

        // 📝 Set values using setter methods (not direct access!)
        st.setRoll(89);         // Setting roll number
        st.setName("vinay");    // Setting student name

        // 📤 Access and print values using getter methods
        System.out.println("Roll Number: " + st.getRoll());  // Output: 89
        System.out.println("Student Name: " + st.getName()); // Output: vinay
    }
}
