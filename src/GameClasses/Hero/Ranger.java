package GameClasses.Hero;

public class Ranger extends Hero {

    public Ranger (){
        this( "",60.0,6,4,2,0);
    }

    public Ranger( String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType) {
        super(name,life, strength,skill,magicka,atkType);
    }

}
