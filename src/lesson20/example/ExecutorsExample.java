package lesson20.example;

import java.util.concurrent.*;

public class ExecutorsExample {
    public static void main(String[] args) {

//        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
//
//        singleExecutor.submit(new MyRunnable());
//        singleExecutor.submit(new MyRunnable());
//        singleExecutor.submit(new MyRunnable());
//
//        singleExecutor.shutdown();


//        ExecutorService fixedExecutor = Executors.newFixedThreadPool(2);
//        fixedExecutor.submit(new MyRunnable());
//        fixedExecutor.submit(new MyRunnable());
//        fixedExecutor.submit(new MyRunnable());
//        fixedExecutor.submit(new MyRunnable());
//        fixedExecutor.submit(new MyRunnable());
//        fixedExecutor.submit(new MyRunnable());
//        fixedExecutor.submit(new MyRunnable());
//
//        fixedExecutor.shutdown();
//

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Check that service is running....");
            }
        }, 0, 5, TimeUnit.SECONDS);


        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduledExecutorService.shutdown();


    }
}


