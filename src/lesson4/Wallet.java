package lesson4;

public class Wallet {

    int amount;

    Wallet(int amount){
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "amount=" + amount +
                '}';
    }
}
