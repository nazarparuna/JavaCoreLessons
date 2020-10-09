package lesson7.dip.good;

public class MobileDBAccess implements DBAccess {
    @Override
    public void getData() {
        System.out.println("Please, touch a screen");
        System.out.println("Return data for Mobile");
        System.out.println("Data for Mobile Client");
    }
}
