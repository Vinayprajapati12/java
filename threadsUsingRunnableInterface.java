package company;

// Task for thread 1
class myThreadRunnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) { // loop 100 times
            System.out.println("i am a thread 1 not a threat");
        }
    }
}

// Task for thread 2
class myThreadRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) { // loop 100 times
            System.out.println("i am a thread 2 not a threat");
        }
    }
}

public class threads2 {
    public static void main(String[] args) {
        // Create Runnable objects (the tasks)
        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        myThreadRunnable2 bullet2 = new myThreadRunnable2();

        // Wrap tasks in Thread objects
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        // Start both threads
        gun1.start();
        gun2.start();
    }
}

/*

output
  i am a thread 1 not a threat
i am a thread 2 not a threat
i am a thread 1 not a threat
i am a thread 2 not a threat
i am a thread 2 not a threat
i am a thread 1 not a threat
...
*/
