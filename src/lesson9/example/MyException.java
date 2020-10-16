package lesson9.example;

public class MyException extends Exception {

    int hour;
    int minutes;

    public MyException(int hour, int minutes) {
        super();
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "hour=" + hour +
                ", minutes=" + minutes +
                '}';
    }
}
