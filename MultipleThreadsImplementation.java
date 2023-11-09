// A class that implements Runnable interface
class MyRunnable implements Runnable {
  // A method that runs when the thread is started
  public void run() {
    // Print the name of the current thread
    System.out.println("Hello from " + Thread.currentThread().getName());
  }
}

// The main class of the program
public class MultipleThreadsImplementation {
  // The main method of the program
  public static void main(String[] args) {
    // Create three instances of MyRunnable class
    MyRunnable r1 = new MyRunnable();
    MyRunnable r2 = new MyRunnable();
    MyRunnable r3 = new MyRunnable();

    // Create three threads and pass the instances of MyRunnable class
    Thread t1 = new Thread(r1, "Thread 1");
    Thread t2 = new Thread(r2, "Thread 2");
    Thread t3 = new Thread(r3, "Thread 3");

    // Start the threads
    t1.start();
    t2.start();
    t3.start();
  }
}
