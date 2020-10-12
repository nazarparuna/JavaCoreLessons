package lesson8.example;

public enum TrafficLights {

    RED("Red"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE();

    private String name;

    TrafficLights() {
    }

    TrafficLights(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This is a new format " + super.toString();
    }
}
