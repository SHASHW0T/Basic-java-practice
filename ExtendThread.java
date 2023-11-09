// Define a class that extends the Thread class
public class MyThread extends Thread {

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
public class ExtendThread {

    public static void main(String[] args) {
        // Create an object of the MyThread class
        MyThread myThread = new MyThread();
        // Start the thread
        myThread.start();
    }
}
