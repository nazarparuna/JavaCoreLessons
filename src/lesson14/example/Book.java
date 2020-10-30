package lesson14.example;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book book2) {
        int yearComp = this.getYear() - book2.getYear();
        if (yearComp == 0) {
            int authorComp = this.getAuthor().compareTo(book2.getAuthor());
            if (authorComp == 0) {
                return this.getName().compareTo(book2.getName());
            } else {
                return authorComp;
            }
        }
        return yearComp;
    }
}
