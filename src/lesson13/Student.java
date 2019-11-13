package lesson13;

public class Student implements Comparable<Student> {

    private int level;
    private String name;
    private int age;

    public Student(int level, String name, int age) {
        super();
        this.level = level;
        this.name = name;
        this.age = age;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    @Override
    public String toString() {
        return "Student [level=" + level + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        return this.getLevel().compareTo(o.getLevel());
    }
}
