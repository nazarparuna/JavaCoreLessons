package lesson19;

import java.io.*;

public class ApplicationBasicStreams {

    public static void main(String[] args) throws IOException {

//        System.in

        // create file
//        File file = new File("buffer.txt");
//        File writerFile = new File("writerFile.txt");
        File readFile = new File("readFile.txt");
        File noAccessFile = new File("accessFile.txt");
        File dir = new File("\\dir");
//        String data = "Hello, Java 13!";
//        String fileName = "bufferRead.txt";

        System.out.println(readFile.canExecute());
        System.out.println(readFile.getName());
        System.out.println(readFile.getPath());
        System.out.println(readFile.getAbsolutePath());
        System.out.println(readFile.getParent());
        System.out.println(readFile.isFile());
        System.out.println(readFile.isDirectory());
        System.out.println(readFile.canRead());
        System.out.println(readFile.canWrite());
        System.out.println();
        System.out.println(noAccessFile.getAbsolutePath());
        System.out.println(noAccessFile.canRead());
        System.out.println(noAccessFile.canWrite());

        // write to file using only byte output stream

//        writeToFileWithBufferedOutputStream(file, data);

        // reading from file using byte input stream
//        String s = readFromFileWithBufferedInputtStream(fileName);
//        System.out.println("Content of file is : \n" + s);
//        System.out.println();

        // write to file with writer
//        writeToFileWithWriter(writerFile, data);
//        writeToFileWithWriter(writerFile, "\nThis is the end of the file!");


        // read from file with reader
//        String s = readFromFileWithReader(readFile);
//        System.out.println("Content of file is : \n" + s);
//        System.out.println();
    }

    private static String readFromFileWithReader(File file) {
        StringBuilder result = new StringBuilder();
        try (Reader fileReader = new FileReader(file)) {
            int i = fileReader.read();
            while (i != -1) {
                result.append((char) i);
                i = fileReader.read();
            }
        } catch (IOException e) {
            System.out.println("Error of reading!");
        }
        return result.toString();
    }

    private static void writeToFileWithWriter(File file, String data) {
        try (Writer fileWriter = new FileWriter(file, true)) {
            fileWriter.write(data);
        } catch (IOException e) {
            System.out.println("Error of writing!");
        }
    }

    private static String readFromFileWithBufferedInputtStream(String fileName) {
        StringBuilder result = new StringBuilder();
        try (InputStream inputStream = new FileInputStream(fileName);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            int i = bufferedInputStream.read();
            while (i != -1) {
                result.append((char) i);
                i = bufferedInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        } catch (IOException e) {
            System.out.println("Error of writing!");
        }
        return result.toString();
    }

    private static void writeToFileWithBufferedOutputStream(File file, String data) {
        try (OutputStream outputStream = new FileOutputStream(file);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {

            byte[] bytes = data.getBytes();
            for (byte b : bytes) {
                bufferedOutputStream.write(b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        } catch (IOException e) {
            System.out.println("Error of writing!");
        }
    }

}