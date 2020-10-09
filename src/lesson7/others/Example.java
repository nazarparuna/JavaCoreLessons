package lesson7.others;

public class Example {

    public static void main(String[] args) {
        showDataFromDB(getDataFromDB());

        showDataFromDB(getDataFromDB());
    }

    public static void showDataFromDB(String data) {
        System.out.println("=============");
        System.out.println(data);
        System.out.println("=============");
    }

    public static String getDataFromDB() {
        return "some string";
    }
}


