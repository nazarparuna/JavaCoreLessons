package lesson19.example;

import java.io.File;

public class FileTest {

    public static void main(String[] args) {

        String fileName = "resources" + File.separator + "text-example.txt";
        File file = new File(fileName);

        System.out.println(file.getAbsolutePath());
        System.out.println(file.canWrite()); // true

        System.out.println(file.getPath());
        System.out.println(file.isDirectory()); // false
        System.out.println(new File("resources").isDirectory()); // true

//        System.out.println(file.);


    }
}
