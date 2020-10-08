package lesson6.delegation;

import lesson6.delegation.Worker;

public class Boss {

    Worker[] workers = new Worker[10];

    public void showAllWorkers() {
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }

    public void work(String task) {
        for (Worker worker : workers) {
            if (worker != null) {
                if (!worker.busy) {
                    worker.work(task);
                    return;
                }
            }
        }
    }

    public boolean setWorker(Worker newWorker) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == null) {
                workers[i] = newWorker;
                return true;
            }
        }
        return false;
    }
}
