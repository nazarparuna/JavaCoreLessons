package lesson19.example;

import java.io.*;

public class InputStreamTest {
    public static void main(String[] args) {
        String fileName = "resources" + File.separator + "text-example.txt";
        File file = new File(fileName);

        readFromFileByBufferedInputStream(file);
    }

    private static void readFromFileByBufferedInputStream(File file) {

        StringBuilder stringBuilder = new StringBuilder();

        try (InputStream inputStream = new FileInputStream(file)) {

            byte byteVar = (byte) inputStream.read();

            while (byteVar != -1) {
                stringBuilder.append((char) byteVar);
                byteVar = (byte) inputStream.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File was not founded!");
        } catch (IOException e) {
            System.out.println("Error during reading");
        }

        System.out.println(stringBuilder.toString());

    }
}
