package lesson20.example;

public class WaitAndNotifyExample {

    public static int counter = 0;

    public static void main(String[] args) {

        WaitAndNotifyExample waitAndNotifyExample = new WaitAndNotifyExample();

        class Thread1 extends Thread {
            @Override
            public void run() {
                System.out.println("Before wait method....");
                WaitAndNotifyExample.increment();
                try {
                    waitAndNotifyExample.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("After returning from thread #2...");
            }
        }

        class Thread2 extends Thread {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Inside another thread....");
                for (int i = 0; i < 100; i++) {
                    WaitAndNotifyExample.increment();
                }
                waitAndNotifyExample.notify();
            }
        }

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }

    public synchronized static void increment() {
        counter++;
    }
}

