package lesson4;

public class Brain {
    int volume;
    Brain(int volume){
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Brain{" +
                "volume=" + volume +
                '}';
    }
}
