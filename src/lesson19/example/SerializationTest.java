package lesson19.example;

import java.io.*;

public class SerializationTest {

    public static void main(String[] args) {
        Book book = new Book(1, "Java Core", "Non-fiction", "Bloch");

        try (OutputStream fileOutputStream = new FileOutputStream("resources\\book-example.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(book);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inputStream = new FileInputStream("resources\\book-example.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            Book readedBook = (Book) objectInputStream.readObject();
            System.out.println(readedBook);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
