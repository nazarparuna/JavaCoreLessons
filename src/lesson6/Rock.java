package lesson6;

public class Rock {

    void playSongDefault(String song) {
        System.out.println("Now is playing " + song);
    }

    public void playSongPublic(String song) {
        System.out.println("Now is playing " + song);
    }

    protected void playSongProtected(String song) {
        System.out.println("Now is playing " + song);
    }

    private void playSongPrivate(String song) {
        System.out.println("Now is playing " + song);
    }

}
