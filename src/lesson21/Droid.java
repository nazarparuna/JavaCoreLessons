package lesson21;

public class Droid {
    @Fielder
    public String name;

    @Fielder("non-default value")
    public int gears;

    public int yearOfManufacturing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }
}
