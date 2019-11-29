package lesson20;

public class ApplicationBasic {
    public static void main(String[] args) throws InterruptedException {

//        Thread thread = Thread.currentThread();
//
//        System.out.println(thread.getName());
//
//        thread.setPriority(Thread.MAX_PRIORITY);
//        thread.setPriority(Thread.MIN_PRIORITY);

        // extend thread
        FixedThread myThread = new FixedThread("1", 500);

        // start thread
//        myThread.start();

        // implements runnable
        MyRunnable myRunnable = new MyRunnable("2", 500);

//        new Thread(myRunnable).start();

        // start

        // exception in thread

        // run with run method

//        myThread.start();

        System.out.println("Text in the main thread!");

//        myThread.stop();

//        new Object().
//        Thread.sleep();
        FixedThread daemonThread = new FixedThread("Deamon", 500);
        daemonThread.setDaemon(true);
        System.out.println(daemonThread.isDaemon());
        daemonThread.start();
        Thread.sleep(500);
        System.out.println("End of the program");
    }


}

class MyThread extends Thread {

    String name;
    int delay;

    public MyThread(String name, int delay) {
        super();
        this.name = name;
        this.delay = delay;
    }

    public void run() {
//        String str = null;
//        str.length();
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread " + name + " is on count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            if(i == 10){
//                this.stop();
//            }
        }
    }
}

class MyRunnable implements Runnable {

    String name;
    int delay;

    public MyRunnable(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread " + name + " is on count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
