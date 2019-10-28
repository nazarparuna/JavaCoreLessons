package lesson7.dip.bad;

public class MobileClient extends Client {
    DBAccess dbAccess = new DBAccess();

    void show() {
        System.out.println("From Mobile:");
        dbAccess.getData(this);
    }
}
