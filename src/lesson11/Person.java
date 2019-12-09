package lesson11;

public class Person {

    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String result = "Person [name=" + name + ", age=" + age + "]";
        System.out.println(result);
        return result;
    }

}
