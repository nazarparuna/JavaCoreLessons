package lesson9.example;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws MyException, Exception {
////        System.out.println(1/0);
//        String str = new String("Hello, world!");
//        System.out.println(str.length());
////        Answers answer = Answers.valueOf("YESsss");
//
//        try {
////            throw new Throwable("message for throwable object");
////            throw new Exception();
//            throw new MyException(20, 7);
//        } catch (MyException e) {
//            System.out.println("We catch my exception!");
//            System.out.println(e.getHour());
//            System.out.println(e.getMinutes());
//        } catch (Exception e) {
//            System.out.println("We catch exception!");
//        } catch (Throwable t) {
//            System.out.println("We catch throwable");
//            System.out.println(t.getMessage());
//        }
//
//        try {
//            throw new MyRuntimeException();
//        } catch (MyRuntimeException e) {
//            System.out.println("we catch runtime exception");
//        }

//        try {
//            System.out.println(1 / 0);
//        } catch (RuntimeException e) {
//            System.out.println("we catch runtime exception");
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
//                System.out.println(stackTraceElement.getMethodName());
//            }
//        } finally {
//            System.out.println("we are inside of finally block");
//        }
//        BufferedInputStream bf = null;
//        try {
//            bf = new BufferedInputStream(System.in);
//
//            BufferedReader r = new BufferedReader(new InputStreamReader(bf));
//
//            String line = r.readLine();
//            System.out.println(line);
//        } catch (IOException e) {
//            bf.close();
//        }

        try (BufferedInputStream bf = new BufferedInputStream(System.in)) {


            BufferedReader r = new BufferedReader(new InputStreamReader(bf));

            String line = r.readLine();
            System.out.println(line);
        }


//
//        calculate(true);
//        calculate2(true);


//        throw new OutOfMemoryError();


//        getIndex();
//        getLength();
    }

    public static void getLength() {
        String str2 = null;
        System.out.println(str2.length());
    }

    public static int getIndex() {
        int[] array = new int[3];
        return array[3];
    }

    public static int calculate(boolean throwOrNot) throws MyException {
        if (throwOrNot) {
            throw new MyException(20, 17);
        }
        return 0;
    }

    public static int calculate2(boolean throwOrNot) throws Exception {
        if (throwOrNot) {
            throw new Exception();
        }
        return 0;
    }
}
