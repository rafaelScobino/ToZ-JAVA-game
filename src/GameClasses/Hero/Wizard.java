package GameClasses.Hero;

public class Wizard extends Hero {

    public Wizard() {
        this("",50.0, 3, 7, 3,0);
    }

    public Wizard( String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType) {
        super(name,life, strength,skill,magicka,atkType);
    }
}
