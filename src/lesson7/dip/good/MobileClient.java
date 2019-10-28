package lesson7.dip.good;

public class MobileClient {
    DBAccess dbAccess = new MobileDBAccess();

    void show() {
        System.out.println("From Mobile:");
        dbAccess.getData();
    }
}
