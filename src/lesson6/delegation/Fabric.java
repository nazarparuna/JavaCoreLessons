package lesson6.delegation;

public class Fabric {

    static Worker[] workers = new Worker[10];

    public static Worker getNotBusyWorker() {
        for (Worker worker : workers) {
            if (worker != null) {
                if (!worker.busy) {
                    return worker;
                }
            }
        }
        return null;
    }

    public static boolean setWorker(Worker newWorker) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == null) {
                workers[i] = newWorker;
                return true;
            }
        }
        return false;
    }
}
