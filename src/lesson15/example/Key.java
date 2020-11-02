package lesson15.example;

import java.util.Objects;

public class Key implements Comparable<Key> {

    private int id;
    private String name;

    public Key(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return id == key.id &&
                name.equals(key.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Key o) {
        int idComp = this.id - o.getId();
        if (idComp == 0) {
            return this.name.compareTo(o.getName());
        }
        return idComp;
    }

    @Override
    public String toString() {
        return "Key{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
