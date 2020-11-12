package lesson19.example;

import java.io.*;

public class OutputStreamTest {
    public static void main(String[] args) {
        String fileName = "resources" + File.separator + "text-write-example.txt";
        File file = new File(fileName);

//        String data = "My new line. \nІ частинка українською...";
        String data = "try to add something";
        writeFromFileByBufferedInputStream(file, data);
    }

    private static void writeFromFileByBufferedInputStream(File file, String data) {
        StringBuilder stringBuilder = new StringBuilder();

        try (OutputStream outputStream = new FileOutputStream(file)) {

            outputStream.write(data.getBytes());

        } catch (FileNotFoundException e) {
            System.out.println("File was not founded!");
        } catch (IOException e) {
            System.out.println("Error during reading");
        }

        System.out.println(stringBuilder.toString());
    }
}
