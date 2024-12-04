class Counter {
    private int counter = 0;

    // Synchronize the increment method to prevent race conditions
    public synchronized void increment() {
        // Only one thread can execute this at a time
        counter++;
    }

    public int getValue() {
        return counter;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create two threads that increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final counter value: " + counter.getValue());
    }
}
