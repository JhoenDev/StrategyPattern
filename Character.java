public class Character {
    private CharType type;

    public Character(CharType type) {
        this.type = type;
    }

    public void attack() {
        System.out.println(type.attack());
    }

    public void defend() {
        System.out.println(type.defend());
    }
}
