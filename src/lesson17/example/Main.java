package lesson17.example;

public class Main {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        String model = "Bohdan";
        CarFactory.Bus bus = factory.createBus(model);
        bus.start();
        bus.drive();
        bus.stop();

        System.out.println();
        System.out.println("Inner class:\n");
        System.out.println(bus);


        Car taxi = factory.createTaxi("838");

        System.out.println(taxi);

        taxi.start();
        taxi.drive();
        taxi.stop();

        System.out.println();
        System.out.println("Anonymous class:\n");

        Car truck = factory.createTruck(10);

        System.out.println(truck);

        truck.start();
        truck.drive();
        truck.stop();

        System.out.println();
        System.out.println("Static inner class:\n");

        CarFactory.Kart kart = factory.createKart("Ferrari");
        System.out.println(kart);

        kart.start();
        kart.drive();
        kart.stop();


    }

}
