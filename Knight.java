public class Knight implements CharType {
    AttackStrategy atkstrat;
    DefenseStrategy dfnstrat1;
    DefenseStrategy dfnstrat2;
    DefenseStrategy dfnstrat3;

    public Knight() {
        atkstrat = new SwingSword();
        dfnstrat1 = new Shield();
        dfnstrat2 = new Dodge();
        dfnstrat3 = new CreateMagic();
    }

    @Override
    public String attack() {
        return "Knight " + atkstrat.attack();
    }

    @Override
    public String defend() {
        return "Knight " + dfnstrat1.defend() +
                "\nKnight " + dfnstrat2.defend() +
                "\nKnight " + dfnstrat3.defend();

    }

}
