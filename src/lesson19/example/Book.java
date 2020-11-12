package lesson19.example;

import java.io.Serializable;

public class Book implements Serializable {

    transient int id;

    String name;

    String genre;

    String author;

    public Book(int id, String name, String genre, String author) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
