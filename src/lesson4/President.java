package lesson4;

public class President {

    private President president;

    private President() {
    }

    public President getInstance() {
        if (president == null) {
            president = new President();
        }
        return president;
    }
}
