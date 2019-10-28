package lesson7.dip.bad;

public class Main {
    public static void main(String[] args) {
        WebClient webClient = new WebClient();
        MobileClient mobileClient = new MobileClient();

        webClient.show();
        mobileClient.show();

    }
}
