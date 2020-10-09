package lesson7.dip.bad;

public class DBAccess {
    void getData(Client client) {
        if (client.getClass().toString().contains("Mobile")) {
            System.out.println("Please, touch a screen");
            System.out.println("Return data for Mobile");
        } else {
            System.out.println("Please, input login");
            System.out.println("Please, input password");

            System.out.println("Return data for Web");
        }
    }
}
