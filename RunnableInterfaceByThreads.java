// Define a class that implements the Runnable interface
public class MyRunnable implements Runnable {

    // Override the run() method to define the task of the thread
    @Override
    public void run() {
        // Print the name of the current thread
        System.out.println("The name of the thread is " + Thread.currentThread().getName());
        // Do some other work
        for (int i = 1; i <= 5; i++) {
            System.out.println("The value of i is " + i);
        }
    }
}

// Define a class that contains the main method
public class RunnableInterfaceByThreads {

    public static void main(String[] args) {
        // Create an object of the MyRunnable class
        MyRunnable myRunnable = new MyRunnable();
        // Create a thread object and pass the MyRunnable object as a parameter
        Thread thread = new Thread(myRunnable);
        // Start the thread
        thread.start();
    }
}
