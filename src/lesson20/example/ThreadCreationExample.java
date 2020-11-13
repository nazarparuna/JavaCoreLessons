package lesson20.example;

import java.util.concurrent.TimeUnit;

public class ThreadCreationExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.start();
        if (args.length == 0) {
//            throw new RuntimeException();
        }

        MyRunnable myRunnable = new MyRunnable();
//        myRunnable.run();

        new Thread(myRunnable).start();

        try {
//            Thread.sleep(5);
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("text in main method");
    }
}
