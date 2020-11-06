package lesson17.example;

public class CarFactory {

    String name = "ZAZ";
    private int year = 1990;
    private static int lines = 4;

    public static Car returnCarByStatic() {
        CarFactory factory = new CarFactory();
        return factory.new Bus("MAZ");
    }

    public Car returnCarByNotStatic() {
        return new Bus("MAZ");
    }

    public Bus createBus(String model) {
        return new Bus(model);
    }

    public Car createTaxi(String service) {

        int localVar = 0;

        class Taxi implements Car {

            private String serviceName;

            public Taxi(String serviceName) {
                this.serviceName = serviceName;
            }

            @Override
            public void start() {
                System.out.println(lines);
                System.out.println(year);
                System.out.println(localVar);
                System.out.println("Taxi found a client.");
            }

            @Override
            public void drive() {
                System.out.println("Taxi picked up a client.");
            }

            @Override
            public void stop() {
                System.out.println("Taxi delivered a client.");
            }

            @Override
            public String toString() {
                return "Taxi{" +
                        "serviceName='" + serviceName + '\'' +
                        '}';
            }
        }

        return new Taxi(service);

    }

    public Car createTruck(int weight) {

        int localVar = 5;

        return new Car() {

            @Override
            public void start() {
                System.out.println(lines);
                System.out.println(year);
                System.out.println(localVar);
                System.out.println("Picked up some cargo.");
            }

            @Override
            public void drive() {
                System.out.println("Delivered to destination point!");
            }

            @Override
            public void stop() {
                System.out.println("Delivered cargo successfully!");
            }

            @Override
            public String toString() {
                return "$classname{" +
                        "weight=" + weight +
                        '}';
            }
        };
    }

    public Kart createKart(String command) {
        return new Kart(command);
    }

    public static class Kart implements Car {

        private String command;

        public Kart(String command) {
            this.command = command;
        }

        @Override
        public void start() {
            CarFactory factory = new CarFactory();
            System.out.println(lines);
            System.out.println(factory.name);
            System.out.println(factory.year);
            System.out.println("Start on the start line.");
        }

        @Override
        public void drive() {
            System.out.println("Drive as fast as possible");
        }

        @Override
        public void stop() {
            System.out.println("After the finish line.");
        }

        @Override
        public String toString() {
            return "Kart{" +
                    "command='" + command + '\'' +
                    '}';
        }
    }

    public class Bus implements Car {

        private String model;

        public Bus(String model) {
            this.model = model;
        }

        @Override
        public void start() {
            System.out.println(lines);
            returnCarByStatic();
            System.out.println("Start engine in bus.");
        }

        @Override
        public void drive() {
            System.out.println("Start drive to closest bus stop.");
        }

        @Override
        public void stop() {
            System.out.println("Stop near the bus stop.");
        }

        @Override
        public String toString() {
            System.out.println("Factory name: " + name + " \nOpening date: " + year);
            return "Bus{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }
}
