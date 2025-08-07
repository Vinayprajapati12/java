package oop; // Package declaration

// Parent class
class phone {
    public void showTime() {
        // Method to display time
        System.out.println(" time is 8 am ");
    }

    public void on() {
        // Method to turn on phone
        System.out.println(" Turning on phone");
    }
}

// Child class that extends phone
class smartPhone extends phone {

    public void music() {
        // Method only in smartPhone
        System.out.println("playing music ");
    }

    @Override
    public void on() {
        // Overridden method from phone class
        System.out.println(" Turning on smart phone");
    }
}

// Main class
public class dynamicMethodDispatch {
    public static void main(String[] args) {

        // phone reference holding smartPhone object
        phone obj = new smartPhone(); // ✅ Allowed (Polymorphism)

        obj.showTime(); // Calls phone class method
        obj.on();       // Calls smartPhone's overridden method

        // obj.music(); // ❌ Not allowed - reference is of type phone
    }
}

/*
output:
 time is 8 am 
 Turning on smart phone
*/
