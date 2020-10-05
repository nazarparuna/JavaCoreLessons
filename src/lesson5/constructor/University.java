package lesson5.constructor;

public class University {

    private int year;
    private String name;
    private int facultiesNumber;

    @Override
    public String toString() {
        return "University{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", facultiesNumber=" + facultiesNumber +
                '}';
    }

    public University() {
        this(1863, "Politech");
    }

    public University(int year, String name) {
        this(year, name, 20);
    }

    public University(int year, String name, int facultiesNumber) {
        this.year = year;
        this.name = name;
        this.facultiesNumber = facultiesNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFacultiesNumber() {
        return facultiesNumber;
    }

    public void setFacultiesNumber(int facultiesNumber) {
        this.facultiesNumber = facultiesNumber;
    }
}
