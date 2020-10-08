package lesson6.delegation;

public class Lesson6Delegation {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setWorker(new Worker(1));
        boss.setWorker(new Worker(2));
        boss.setWorker(new Worker(3));

        boss.showAllWorkers();
        boss.work("Зробити те");
        boss.work("Зробити ce");

        System.out.println("======================");
        Fabric.setWorker(new Worker(100));
        BossWithClearDelegation boss2 = new BossWithClearDelegation();
        boss2.work("Моя делегована задача");

    }
}
