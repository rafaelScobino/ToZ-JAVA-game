package GameClasses.Hero;

public class Fighter extends Hero {

    public Fighter(){
        this( "",70.0,4,6,1);
    }

    public Fighter( String name, Double life, Integer strength, Integer skill, Integer magicka) {
        super(name,life, strength,skill,magicka);
    }

}
