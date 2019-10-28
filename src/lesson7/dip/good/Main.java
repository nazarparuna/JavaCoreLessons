package lesson7.dip.good;

public class Main {
    public static void main(String[] args) {
        WebClient webClient = new WebClient();
        MobileClient mobileClient = new MobileClient();

        webClient.show();
        mobileClient.show();

    }
}
