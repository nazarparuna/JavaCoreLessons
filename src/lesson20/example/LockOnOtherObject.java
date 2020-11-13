package lesson20.example;

public class LockOnOtherObject {

    public static int counter = 0;
    private Object lock = new Object();

    public static void main(String[] args) {
        LockOnOtherObject lockOnOtherObject = new LockOnOtherObject();

        IncrementObjectThread incrementThread = new IncrementObjectThread(lockOnOtherObject);
        IncrementObjectThread incrementThread2 = new IncrementObjectThread(lockOnOtherObject);
        IncrementObjectThread incrementThread3 = new IncrementObjectThread(lockOnOtherObject);
        IncrementObjectThread incrementThread4 = new IncrementObjectThread(lockOnOtherObject);
        incrementThread.start();
        incrementThread2.start();
        incrementThread3.start();
        incrementThread4.start();

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

    public void incrementFromObject() {
        synchronized (lock) {
            counter++;
        }
    }

}

class IncrementObjectThread extends Thread {

    private LockOnOtherObject lockOnOtherObject;

    public IncrementObjectThread(LockOnOtherObject lockOnOtherObject) {
        this.lockOnOtherObject = lockOnOtherObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            lockOnOtherObject.incrementFromObject();
        }
    }
}
