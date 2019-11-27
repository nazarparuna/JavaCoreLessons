package lesson19;

import java.io.Serializable;

public class Student implements Serializable {
    private transient int age;
    private String firstName;
    private String lastname;

    public Student(int age, String firstName, String lastname) {
        super();
        this.age = age;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", firstName=" + firstName + ", lastname=" + lastname + "]";
    }
}