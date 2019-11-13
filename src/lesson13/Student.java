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

    public int getLevel() {
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

    public int getAge() {
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
        if (this.level > o.getLevel()) {
            return 1;
        } else if (this.level < o.getLevel()) {
            return -1;
        } else {
            if (this.name.compareTo(o.getName()) > 0) {
                return 1;
            } else if (this.name.compareTo(o.getName()) < 0) {
                return -1;
            } else {
                if (this.age > o.getAge()) {
                    return 1;
                } else if (this.age < o.getAge()) {
                    return -1;
                }
            }
        }

        return 0;
    }
}
