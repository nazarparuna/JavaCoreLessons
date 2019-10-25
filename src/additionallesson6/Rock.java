package additionallesson6;

public class Rock {
    public void liePublic(double x, double y) {
        System.out.println(String.format("I am lying in (%.2f, %.2f)", x, y));
    }

    private void liePrivate(double x, double y) {
        System.out.println(String.format("I am lying in (%.2f, %.2f)", x, y));
    }

    protected void lieProtected(double x, double y) {
        System.out.println(String.format("I am lying in (%.2f, %.2f)", x, y));
    }

    void lieDefault(double x, double y) {
        System.out.println(String.format("I am lying in (%.2f, %.2f)", x, y));
    }
}
