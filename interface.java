package oop;

// Interface 1
interface bicycle {
    int a = 45; // constant
    void applyBrake(int decrement); // method
    void speedUp(int increment);    // method
}

// Interface 2
interface hornBicycle {
    void blowHornK3g(); // method
    void blowHornmhn(); // method
}

// Implements both interfaces
class avonCycle implements bicycle, hornBicycle {
    public void applyBrake(int decrement) {
        System.out.println("Applying brake");
    }
    public void speedUp(int increment) {
        System.out.println("Applying speedUp");
    }
    public void blowHornK3g() {
        System.out.println("kabhi khusi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn() {
        System.out.println("mai hu na po po po po");
    }
}

// Main
public class interfaces {
    public static void main(String[] args) {
        avonCycle ac = new avonCycle(); // object
        ac.applyBrake(1); // brake
        System.out.println(ac.a); // prints 45
        // ac.a = 44; // ❌ final, can't change
        ac.blowHornK3g(); // horn 1
        ac.blowHornmhn(); // horn 2
    }
}
