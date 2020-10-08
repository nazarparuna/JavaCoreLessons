package lesson6.delegation;

import java.util.Scanner;

public class BossWithClearDelegation {

    void work(String task) {
        Worker worker = Fabric.getNotBusyWorker();
        if (worker != null) {
            worker.work(task);
            return;
        }
    }

}
