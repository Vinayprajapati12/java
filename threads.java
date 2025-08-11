package company;

// Thread 1 - Cooking
class myThreads1 extends Thread {
    @Override
    public void run() { // task for thread 1
        int i = 0;
        while (i < 100) {
            System.out.println("My Cooking thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}

// Thread 2 - Chatting
class myThreads2 extends Thread {
    @Override
    public void run() { // task for thread 2
        int i = 0;
        while (i < 100) {
            System.out.println("Thread 2 for chatting with her");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class threads {
    public static void main(String[] args) {
        myThreads1 t1 = new myThreads1(); // create thread 1
        myThreads2 t2 = new myThreads2(); // create thread 2
        t1.start(); // start thread 1
        t2.start(); // start thread 2
    }
}

/*

output

  My Cooking thread is running
I am happy
Thread 2 for chatting with her
I am sad
Thread 2 for chatting with her
I am sad
My Cooking thread is running
I am happy
...
*/
