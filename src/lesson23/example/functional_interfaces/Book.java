package lesson23.example.functional_interfaces;

public class Book {
    private int id;
    private String name;
    private String author;
    private int year;
    private double price;

    public Book(int id, String name, String author, int year, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", age=" + year +
                ", price=" + price +
                '}';
    }
}
