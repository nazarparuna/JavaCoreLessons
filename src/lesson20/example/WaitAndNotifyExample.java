package lesson20.example;

public class WaitAndNotifyExample {

    public static void main(String[] args) {

        // спільний монітор для синхрохізації роботи потоків
        WaitAndNotifyExample waitAndNotifyExample = new WaitAndNotifyExample();

        class Thread1 extends Thread {
            @Override
            public void run() {
                synchronized (waitAndNotifyExample) {
                    System.out.println("Before wait method....");
                    try {
                        // виклик wait() на спільному моніторі передає розблоковує монітор
                        // і дозволяє іншому потоку працювати з ним
                        waitAndNotifyExample.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("After returning from thread #2...");
                }
            }
        }

        class Thread2 extends Thread {
            @Override
            public void run() {
                try {
                    // додано таймер, щоб потім №2 розпочав свою роботу пізніше
                    // (а відповідно потік №1 залочився на моніторі першим)
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (waitAndNotifyExample) {
                    System.out.println("Inside another thread....");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();

                    // виклик notify() на спільному моніторі повертає роботу в 1-ий потік
                    waitAndNotifyExample.notify();
                }
            }
        }

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }

}

