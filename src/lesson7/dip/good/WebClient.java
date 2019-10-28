package lesson7.dip.good;

public class WebClient {
    DBAccess dbAccess = new WebDBAccess();

    void show() {
        System.out.println("From Web:");
        dbAccess.getData();
    }
}
