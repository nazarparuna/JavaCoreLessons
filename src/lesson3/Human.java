package lesson3;

import java.time.LocalDateTime;

public class Human {

    private int year;
    private String name;
    private String surname;

    public Human() {
    }

    Human(int year) {
        this.year = year;
    }

    public Human(int year, String name, String surname) {
        this.year = year;
        this.name = name;
        this.surname = surname;
    }


    public int getAge() {
        int currentYear = LocalDateTime.now().getYear();
        return currentYear - this.year;
    }

    public int getAge(int year) {
        return year - this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Human{");
        sb.append("year=").append(year);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
