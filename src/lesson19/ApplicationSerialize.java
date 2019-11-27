package lesson19;

import java.io.*;

public class ApplicationSerialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // create file

        File file = new File("student.txt");

        // create student
        Student student = new Student(20, "Nazar", "Paruna");



        // serialize object
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//        student.
        objectOutputStream.writeObject(student);

        // deserialize object
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Student readerStudent = (Student) objectInputStream.readObject();
        System.out.println();
        System.out.println(readerStudent);
    }

}