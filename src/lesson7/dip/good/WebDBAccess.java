package lesson7.dip.good;

public class WebDBAccess implements DBAccess {
    @Override
    public void getData() {
        System.out.println("Data for Web Client");
    }
}
