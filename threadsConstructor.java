package company;

// Thread class
class myThr extends Thread {

    // Set thread name
    public myThr(String name) {
        super(name);
    }

    // Task for thread
    public void run() {
        System.out.println("Thread " + getName() + " says: Thank You...");
    }
}

public class threadConstructor {
    public static void main(String[] args) {
        
        // Create threads
        myThr t = new myThr("Vinay");
        myThr t2 = new myThr("Prajapati");
        
        // Start threads
        t.start();
        t2.start();
        
        // Thread info
        System.out.println("ID of t: " + t.threadId());
        System.out.println("Name of t: " + t.getName());
        System.out.println("Name of t2: " + t2.getName());
    }
}

/*

output
  Thread Vinay says: Thank You...
Thread Prajapati says: Thank You...
ID of t: 21
Name of t: Vinay
Name of t2: Prajapati

  */
