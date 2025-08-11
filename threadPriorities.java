package company;

class myThr1 extends Thread {
    // Constructor to set thread name
    public myThr1(String name) {
        super(name);
    }

    // Code that runs when thread is started
    public void run() {
        System.out.println("Thank You... " + this.getName());
    }
}

public class threadPriorities {
    public static void main(String[] args) {
        // Creating threads with names
        myThr1 t  = new myThr1("Vinay");
        myThr1 t2 = new myThr1("hi2");
        myThr1 t3 = new myThr1("hi3");
        myThr1 t4 = new myThr1("hi4");
        myThr1 t5 = new myThr1("hi5(Most imp)");
        myThr1 t6 = new myThr1("hi6(Normal)");

        // Setting priorities
        t5.setPriority(Thread.MAX_PRIORITY);   // Priority 10 → Highest
        t.setPriority(Thread.MIN_PRIORITY);    // Priority 1 → Lowest
        t2.setPriority(Thread.MIN_PRIORITY);   // Priority 1 → Lowest
        t3.setPriority(Thread.MIN_PRIORITY);   // Priority 1 → Lowest
        t4.setPriority(Thread.MIN_PRIORITY);   // Priority 1 → Lowest
        t6.setPriority(Thread.NORM_PRIORITY);  // Priority 5 → Normal (Default)

        // Starting threads (order may vary in output)
        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}

/*

output
  Thank You... hi5(Most imp)
Thank You... hi6(Normal)
Thank You... Vinay
Thank You... hi2
Thank You... hi3
Thank You... hi4
*/
