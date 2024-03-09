package GameClasses.Hero;

public class Ranger extends Hero {

    public Ranger (){
        this( "",60.0,6,4,2);
    }

    public Ranger (String name, Double life, Integer strength, Integer skill, Integer magicka) {
        super(name,life, strength,skill,magicka);
    }

}
