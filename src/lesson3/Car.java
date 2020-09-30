package lesson3;

public class Car {

    int year;
    String brand;
    String model;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
