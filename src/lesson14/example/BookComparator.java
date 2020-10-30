package lesson14.example;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int yearComp = book1.getYear() - book2.getYear();
        if (yearComp == 0) {
            int authorComp = book1.getAuthor().compareTo(book2.getAuthor());
            if (authorComp == 0) {
                return book1.getName().compareTo(book2.getName());
            } else {
                return authorComp;
            }
        }
        return yearComp;
    }
}
