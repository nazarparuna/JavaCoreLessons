package lesson20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationExecutor {
    public static void main(String[] args) {

        // create executor service
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        FixedThread fixedThread1 = new FixedThread("1", 1);
        FixedThread fixedThread2 = new FixedThread("2", 1);
        FixedThread fixedThread3 = new FixedThread("3", 1);

//        executorService.submit(fixedThread1);
//        executorService.submit(fixedThread2);
//        executorService.submit(fixedThread3);


        singleThreadExecutor.submit(fixedThread1);
        singleThreadExecutor.submit(fixedThread2);
        singleThreadExecutor.submit(fixedThread3);






        // execute thread

        // shutdown
        executorService.shutdown();

    }
}

class FixedThread extends Thread {

    String name;
    int delay;

    public FixedThread(String name, int delay) {
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
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            if(i == 10){
//                this.stop();
//            }
        }
    }
}
