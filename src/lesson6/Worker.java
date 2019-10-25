package lesson6;

public class Worker {

    private int id;

    Worker(int id) {
        this.id = id;
    }

    boolean busy = false;

    void work(String task) {
        System.out.println("Worker #" + id + ": I am working on " + task);
        busy = true;
    }

}
