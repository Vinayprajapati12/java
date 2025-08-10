package oop;

// Camera interface
interface mycamera2 {
    void takeSnap(); // abstract method
    void recordVideo(); // abstract method

    // private helper method (only used inside this interface)
    private void greet() {
        System.out.println("good morning");
    }

    // default method with implementation
    default void record4kVideo() {
        greet(); // call private method
        System.out.println("record in 4k");
    }
}

// WiFi interface
interface mywifi2 {
    String[] getNetworks(); // abstract method
    void connectToNetwork(String network); // abstract method
}

// Base class
class myCellPhone2 {
    void callNumber(int phoneNumber) { // call a number
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() { // pick an incoming call
        System.out.println(" connecting... ");
    }
}

// SmartPhone class (inherits myCellPhone2 & implements both interfaces)
class mySmartPhone2 extends myCellPhone2 implements mywifi2, mycamera2 {

    // Implementation of camera methods
    public void takeSnap() {
        System.out.println("taking snap");
    }
    public void recordVideo() {
        System.out.println("recording video");
    }

    // Implementation of WiFi methods
    public String[] getNetworks() {
        System.out.println("Getting list of network");
        String[] networkList = {"vinay", "prajapati"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println(" connecting to " + network);
    }
}

public class polymorphismInInterfaces {
    public static void main(String[] args) {

        // Polymorphism: using smartphone object as a camera
        mycamera2 cam1 = new mySmartPhone2();
        // cam1.getNetworks(); --> Not allowed (reference type is mycamera2)
        cam1.record4kVideo(); // calls default method of interface

        // Using smartphone object directly
        mySmartPhone2 obj = new mySmartPhone2();
        obj.callNumber(9794); // inherited from myCellPhone2
        obj.recordVideo(); // implemented in mySmartPhone2
        obj.pickCall(); // inherited from myCellPhone2
    }
}

/*

output

  good morning
record in 4k
Calling 9794
recording video
 connecting...

*/
