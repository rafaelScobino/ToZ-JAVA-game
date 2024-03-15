package GameClasses.Hero;

public class Fighter extends Hero {

    public Fighter(){
        this( "",70.0,4,6,1,0);
    }

    public Fighter( String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType) {
        super(name,life, strength,skill,magicka,atkType);
    }

}
