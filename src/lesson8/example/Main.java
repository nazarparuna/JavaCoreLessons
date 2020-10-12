package lesson8.example;

public class Main {

    public static void main(String[] args) {

//        int[] array = {1, 3, 5, 0, -4, 6, 1};
//
//        for(int item : array){
//            System.out.println(item);
//        }

        for (TrafficLights item : TrafficLights.values()) {
//            System.out.println(item);N
//            System.out.println(item.name());
            System.out.println(item.ordinal());
            System.out.println(item.getName());
        }


        TrafficLights tf1 = TrafficLights.RED;
        TrafficLights tf2 = TrafficLights.GREEN;

        System.out.println(tf1.compareTo(tf2));
        System.out.println(tf2.compareTo(tf1));
        System.out.println(tf1.compareTo(tf1));
        System.out.println("Java".compareTo("java"));
        System.out.println("java".compareTo("Java"));

        System.out.println(tf1.getDeclaringClass());
        System.out.println(tf1.getClass());

        TrafficLights tf3 = TrafficLights.valueOf("RED");
        System.out.println(tf3);
//        System.out.println(TrafficLights.valueOf("red"));

        TrafficLights[] values = TrafficLights.values();

        for (TrafficLights item : values) {
            System.out.println(item.name());
        }

    }
}
