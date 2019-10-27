package consultation2;

public class Carcass {

    private int weight;

    public Carcass(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void makeCarcassBigger(int additionWeight) {
        this.weight += additionWeight;
    }

    @Override
    public String toString() {
        return "Carcass{" +
                "weight=" + weight +
                '}';
    }
}
