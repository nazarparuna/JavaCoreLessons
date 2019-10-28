package lesson7.dip.good;

public class MobileDBAccess implements DBAccess {
    @Override
    public void getData() {
        System.out.println("Data for Mobile Client");
    }
}
