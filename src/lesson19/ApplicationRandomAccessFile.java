package lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class ApplicationRandomAccessFile {
    public static void main(String[] args) throws IOException {
        // create file
        String fileName = "randomAccessFile.txt";

        // add text
        String text = "Methods of File's class is bullshit! ";

        // write to file to 0 position
//        writeData(fileName, text, 0);
//        writeData(fileName, "\nLine 2", text.length());
//        writeData(fileName, " --------------", 10);
        writeData(fileName, " 333 ", 2);

        // show file

        // write to file from different position

        String s = readFromFile(fileName, 8);
        System.out.println("Content of File is next: " + s);


        // read from file from specific position

    }

    private static String readFromFile(String fileName, int position) {
        String result = "";
        try (RandomAccessFile accessFile = new RandomAccessFile(fileName, "rw")) {
            accessFile.seek(position);
            result = accessFile.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static void writeData(String fileName, String text, int position) {
        try (RandomAccessFile accessFile = new RandomAccessFile(fileName, "rw")) {
            accessFile.seek(position);
            accessFile.write(text.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}