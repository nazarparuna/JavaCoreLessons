package lesson20.example;

public class ThreadSynchronizationExample {

    public static int counter = 0;

    private Object lock = new Object();

    public static void main(String[] args) {
        System.out.println(counter);

        IncrementThread incrementThread = new IncrementThread();
        IncrementThread incrementThread2 = new IncrementThread();
        IncrementThread incrementThread3 = new IncrementThread();
        IncrementThread incrementThread4 = new IncrementThread();
        incrementThread.start();
        incrementThread2.start();
        incrementThread3.start();
        incrementThread4.start();

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        try {
            incrementThread.join();
            incrementThread2.join();
            incrementThread3.join();
            incrementThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }

    public static void increment() {
        synchronized (ThreadSynchronizationExample.class) {
            counter++;
        }
    }

    public void incrementFromObject() {
        synchronized (lock) {
            counter++;
        }
    }

}

class IncrementThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            ThreadSynchronizationExample.increment();
        }
    }
}


