package lesson20;

public class ApplicationDeadLock {

    public static void main(String[] args) {

        // create two resources
        ResourceA a = new ResourceA();
        ResourceB b = new ResourceB();
        a.resourceB = b;
        b.resourceA = a;

        DeadlockThread1 t1 = new DeadlockThread1();
        DeadlockThread2 t2 = new DeadlockThread2();

        t1.resourceA = a;
        t2.resourceB = b;

        new Thread(t1).start();
        new Thread(t2).start();


        // create 2 threads

        // run thread until deadlock
    }
}

class ResourceA {
    ResourceB resourceB;

    public synchronized int getNumber() {
        return 1;
    }

    public synchronized int getResource() {

        return this.resourceB.getNumber();
    }
}

class ResourceB {
    ResourceA resourceA;

    public synchronized int getNumber() {
        return 2;
    }

    public synchronized int getResource() {
        return this.resourceA.getNumber();
    }
}

class DeadlockThread1 implements Runnable {

    ResourceA resourceA;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 1 " + resourceA.getNumber() + " - count: " + i);
            System.out.println("Thread 1 " + resourceA.getResource());
        }
    }
}

class DeadlockThread2 implements Runnable {

    ResourceB resourceB;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 2 " + resourceB.getNumber() + " - count: " + i);
            System.out.println("Thread 2 " + resourceB.getResource());
        }
    }
}
