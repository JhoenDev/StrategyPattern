public class Archer implements CharType {
    AttackStrategy atkstrat;
    DefenseStrategy dfnstrat;

    public Archer() {
        atkstrat = new ShootArrow();
        dfnstrat = new Dodge();
    }

    @Override
    public String attack() {
        return "Archer " + atkstrat.attack();
    }

    @Override
    public String defend() {
        return "Archer " + dfnstrat.defend();

    }

}
