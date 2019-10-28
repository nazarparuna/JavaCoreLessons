package lesson7.dip.bad;

public class WebClient extends Client {
    DBAccess dbAccess = new DBAccess();

    void show() {
        System.out.println("From Web:");
        dbAccess.getData(this);
    }
}
