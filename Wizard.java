public class Wizard implements CharType {
    AttackStrategy atkstrat;
    DefenseStrategy dfnstrat;

    public Wizard() {
        atkstrat = new CastSpell();
        dfnstrat = new CreateMagic();
    }

    @Override
    public String attack() {
        return "Wizard " + atkstrat.attack();
    }

    @Override
    public String defend() {
        return "Wizard " + dfnstrat.defend();

    }

}
