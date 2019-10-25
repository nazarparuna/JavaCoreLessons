package lesson6;

public class Boss {

    Worker[] workers = {new Worker(1), new Worker(2), new Worker(3)};

    void work(String task) {
        for (Worker worker : workers) {
            if (!worker.busy)
                worker.work(task);
        }
    }
}
