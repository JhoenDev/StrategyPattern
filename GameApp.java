public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new Knight());
        knight.attack();
        knight.defend();

        Character wizard = new Character(new Wizard());
        wizard.attack();
        wizard.defend();

        Character archer = new Character(new Archer());
        archer.attack();
        archer.defend();

    }
}