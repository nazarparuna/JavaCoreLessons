package lesson6.interfaces;

import lesson6.Book;
import lesson6.Info;
import lesson6.Newspaper;
import lesson6.Print;

public class InterfaceTest {

    public static void main(String[] args) {
        Info info = new Info() {
            @Override
            public void info() {
                System.out.println("Implemented info method");
            }
        };

        info.info();
        info.printBooks(10);
        Info.staticMethod();
        System.out.println(Print.name);

        System.out.println("===================");

        Book book = new Book();
        book.printBooks(10);
        book.toBeSheet();
        Book.Page.getNumber();

//        Object clone = book.clone();

        Print bookVar = getByType(true);
        System.out.println(bookVar.getClass());
        Print newspaperVar = getByType(false);
        System.out.println(newspaperVar.getClass());

        System.out.println("===========================");
        sendType(book);
        sendType(new Newspaper());
    }

    public static Print getByType(boolean isBook) {
        if (isBook) {
            return new Book();
        } else {
            return new Newspaper();
        }
    }

    public static void sendType(Print printVar) {

        if (printVar instanceof Book) {
            System.out.println("I am a book");
        }
        System.out.println(printVar.getClass());
    }
}
