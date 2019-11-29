package lesson20;

public class ApplicationSynchronization {

    public static int number = 0;

    public static void main(String[] args) throws InterruptedException {

        // create variable

        // create thread

        IncrementThread incrementThread = new IncrementThread();


        // increment variable in thread
//        Thread thread = new Thread(incrementThread);
//        thread.start();


        // show result

        // join
//        thread.join();
        Thread[] threadArray = new Thread[5];

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new Thread(incrementThread);
        }

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].join();
        }

        // create bunch of threads

        // synchronize block


        System.out.println("Value of variable number is " + number);

    }

    public static void incrementVariable() {
        synchronized (ApplicationSynchronization.class) {
            number++;
        }
    }

}

class IncrementThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            ApplicationSynchronization.incrementVariable();
        }
    }
}
