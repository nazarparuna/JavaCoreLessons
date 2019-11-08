package lesson12;


public class Student {
    String name;
    int age;
    Wallet wallet;

    public Student(String name, int age, Wallet wallet) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wallet=" + wallet +
                '}';
    }
}
