package lesson7.dip.good;

public class DesktopDBAccess implements DBAccess {
    @Override
    public void getData() {
        System.out.println("Please, say \"It's me\"");
    }
}
