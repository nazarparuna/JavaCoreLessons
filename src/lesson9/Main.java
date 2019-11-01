package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, NoEnoughMoney {

        // приклади null, indexoutof
//        String str = null;
//        str.length();

//        getNumber();

        // create exeption

//        throw new RuntimeException("error message");

//        try {
//            throw new Exception("error message 2");
//        } catch (MyException e){
//            System.out.println("We catch MyException");
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("We catch Exception");
//
//            e.printStackTrace();
//        }

        // init exception


        // throw exception

        // re-throw exception

//        getExeption();

        // catch exception


        // catch multiple

        // finally

//        try {
//            getExeption();
//        } catch (Exception e) {
//            System.out.println("In catch block");
//            e.printStackTrace();
//        } finally {
//            System.out.println("In finally block");
//        }

        // try-finally

        // недохід до блоку finally
//        try {
//            getExeption();
//        } catch (Exception e) {
//            System.out.println("In catch block");
//            System.exit(0);
//        } finally {
//            System.out.println("In finally block");
//        }

        // try-with-resources

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            bufferedReader.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            bufferedReader.close();
//        }
//
//        try (BufferedReader bufferedReader2 =
//                     new BufferedReader(new InputStreamReader(System.in));
//             BufferedReader bufferedReader3 =
//                     new BufferedReader(new InputStreamReader(System.in))) {
//            bufferedReader2.read();
//            bufferedReader3.read();
//        }

        // autoclosable

        /*
            Exceptions
         */

        // створити клас банківський рахунок

        BankAccount bankAccount = new BankAccount(0);

        bankAccount.putMoneyOnDeposit(1000);
        try {
            bankAccount.getMoney(800);
            bankAccount.getMoney(700);
        } catch (NoEnoughMoney noEnoughMoney) {
            System.out.println("We catch NoMoneyException");
            noEnoughMoney.printStackTrace();
        }

        if (getBooleanVar()) { //BAD WRAPS
//            doSomethingAboutIt();                //MAKE THIS LINE EASY TO MISS
        }

        bankAccount.getMoney(700);


        // додати методи

        // викинути помилку

        /*
        Documentation
         */

        // заголовок

        // since, author, version

        // змінні, конструктори

        // методи (param, exeption, author, return, see)

    }

    private static boolean getBooleanVar() {
//        return (condition1 && condition2)
//                || (condition3 && condition4)
//                || !(condition5 && condition6);
        return false;
    }

    static void getExeption() throws Exception {
        throw new Exception("Re-throw");
//        getNothing();
    }


    static int getNumber() {
        int numbers[] = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = i;
        }
        return numbers[5];
    }

    private static void getNothing() {
    }
}
