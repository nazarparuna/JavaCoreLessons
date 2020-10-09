package lesson7.dip.good;

public class DesktopClient {
    DBAccess dbAccess = new DesktopDBAccess();

    void show() {
        System.out.println("From Desktop:");
        dbAccess.getData();
    }
}
