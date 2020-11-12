package lesson19.example;

import java.io.*;

public class ReaderTest {
    public static void main(String[] args) {
        String fileName = "resources" + File.separator + "text-example.txt";
        File file = new File(fileName);

        readFromFileByReader(file);
    }

    private static void readFromFileByReader(File file) {

        StringBuilder stringBuilder = new StringBuilder();

        try (Reader reader = new FileReader(file)) {

            int byteVar = reader.read();

            while (byteVar != -1) {
                stringBuilder.append((char) byteVar);
                byteVar = reader.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File was not founded!");
        } catch (IOException e) {
            System.out.println("Error during reading");
        }

        System.out.println(stringBuilder.toString());

    }
}
