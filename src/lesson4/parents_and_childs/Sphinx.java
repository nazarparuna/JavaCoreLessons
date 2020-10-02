package lesson4.parents_and_childs;

public class Sphinx extends Cat {

    private int age;

    public Sphinx(String species, String nickname, int age) {
        super(species, nickname);
        this.age = age;
    }

    @Override
    public void дряпати() {
        super.дряпати();
        System.out.println("Лисий кіт тебе дуже сильно подряпав. Тікай!!!");
    }

    public void дряпати2() {
        super.дряпати();
    }

}
