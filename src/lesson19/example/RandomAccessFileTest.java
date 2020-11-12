package lesson19.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        String fileName = "resources" + File.separator + "raf-example.txt";
        File file = new File(fileName);

//        readByRAF(file);
        String text = "my new line in this file.....\n";
        writeByRAF(file, text);
    }

    private static void writeByRAF(File file, String text) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            randomAccessFile.write(text.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File was not founded!");
        } catch (IOException e) {
            System.out.println("Error during reading");
        }
    }

    private static void readByRAF(File file) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            String str = randomAccessFile.readLine();
            while (str != null) {
                System.out.println(str);
                str = randomAccessFile.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not founded!");
        } catch (IOException e) {
            System.out.println("Error during reading");
        }
    }


}
