package lesson12;

public class Wallet {
    int balance;
    String brand;

    public Wallet(int balance, String brand) {
        this.balance = balance;
        this.brand = brand;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                ", brand='" + brand + '\'' +
                '}';
    }
}
