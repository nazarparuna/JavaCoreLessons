package lesson4;

public class President {

    private static President president;

    private President() {
        System.out.println("Call constructor of President class");
    }

    public static President getInstance() {
        if (president == null) {
            president = new President();
        }
        System.out.println("Return instance of President class");
        return president;
    }
}
