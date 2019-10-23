package lesson4;

public class Human {
    private Wallet wallet;
    private Brain brain;

    Human(){
        brain = new Brain(2000);
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    void eat(Animal animal){
        System.out.println("Human is eating " + animal.name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "wallet=" + wallet +
                ", brain=" + brain +
                '}';
    }
}
