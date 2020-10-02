package lesson4.parents_and_childs;

public class Cat extends Animal {

    private String nickname;

    public Cat() {
        System.out.println("inside cat");
    }

    public Cat(String species, String nickname) {
        super(species);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void дряпати() {
        System.out.println("Тебе подряпав кіт!");
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cat{");
        sb.append("nickname='").append(nickname).append('\'');
        sb.append(", species='").append(super.getSpecies()).append('\'');
        sb.append(", weight='").append(super.getWeight()).append('\'');
        sb.append(", color='").append(super.getColor()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
