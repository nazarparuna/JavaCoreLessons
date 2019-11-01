/**
 * Copyright кради що хочеш
 */
package lesson9;

/**
 * @author punk-rock
 * @version 0.1
 * @since JDK 1.8
 */
public class BankAccount {

    // save amount of your cash
    private int money;

    // take amount of your money
    public BankAccount(int money) {
        this.money = money;
    }

    /**
     * add some value to your balance
     *
     * @param money - к-сть грошей
     * @return нічого
     * @author Nazar
     * @see - дививсь заголовок
     */
    void putMoneyOnDeposit(int money) {
        this.money += money;
        System.out.println(String.format("You put %s", money));
        System.out.println(String.format("You have %s", this.money));
    }

    // return some value from your balance

    /**
     * @param money - к-сть грошей
     * @return нічого
     * @throws NoEnoughMoney - коли не достатньо коштів
     * @author Nazar
     * @see - дививсь заголовок
     */
    void getMoney(int money) throws NoEnoughMoney {
        if (money > this.money) {
            throw new NoEnoughMoney("There is only " + this.money);
        }
        this.money -= money;
        System.out.println(String.format("You took %s", money));
        System.out.println(String.format("You have %s", this.money));
    }


}
