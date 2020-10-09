package lesson7.srp.good;

public class Cook extends Worker {


    public void cook() {
        System.out.println("I have cooked something tasty!");
    }

    @Override
    public void work() {
        cook();
    }
}
