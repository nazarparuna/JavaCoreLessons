package consultation2;

public class Helm {

    private String color;

    public Helm(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "color='" + color + '\'' +
                '}';
    }
}
