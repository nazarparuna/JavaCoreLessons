package consultation2;

public class Car {

    private String model;
    private Wheel wheel;
    private Helm helm;
    private Carcass carcass;

    public Car(String model, Wheel wheel, Helm helm, Carcass carcass) {
        this.model = model;
        this.wheel = wheel;
        this.helm = helm;
        this.carcass = carcass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Carcass getCarcass() {
        return carcass;
    }

    public void setCarcass(Carcass carcass) {
        this.carcass = carcass;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", helm=" + helm +
                ", carcass=" + carcass +
                '}';
    }

    public void changeCarAsSportCar() {
        setCarcass(new Carcass(1000));
        setHelm(new Helm("Red"));
        setWheel(new Wheel(50));
    }

    public static void main(String[] args) {
        Car car = new Car("Ferrari", new Wheel(30), new Helm("Black"), new Carcass(2500));
        System.out.println(car);
        car.changeCarAsSportCar();
        System.out.println();
        System.out.println(car);
    }

}
