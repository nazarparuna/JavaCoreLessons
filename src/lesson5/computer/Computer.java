package lesson5.computer;

public abstract class Computer {

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void abstractMethod();
}
