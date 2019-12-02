package lesson21;

public class Student {
    @StudentAnnotation(nick = "pushka", grade = 100)
    String name;
    @StudentAnnotation(nick = "bomba")
    int age;
    int scholarship;

    public Student(String name, int age, int scholarship) {
        this.name = name;
        this.age = age;
        this.scholarship = scholarship;
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

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
}
